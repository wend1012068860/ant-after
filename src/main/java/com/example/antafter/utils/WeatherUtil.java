package com.example.antafter.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.antafter.entity.Weather;
import com.example.antafter.enums.AreaEnum;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */
public class WeatherUtil {
    public static void main(String[] args) {
        System.out.println(getWeather());
    }
    public static Weather getWeather(){
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> map = new HashMap<String,String>();
        map.put("district_id", AreaEnum.XUZHOU_FENGXIAN.getAreaCode()); // 地方行政代码
        map.put("data_type","all");//这个是数据类型
        map.put("ak","QpoEj7gw4a6uhraDa2ibr8mkZiypItzc");
        String res = restTemplate.getForObject(
                "https://api.map.baidu.com/weather/v1/?district_id={district_id}&data_type={data_type}&ak={ak}",
                String.class,
                map);
        JSONObject json = JSONObject.parseObject(res);
        JSONArray forecasts = json.getJSONObject("result").getJSONArray("forecasts");
        List<Weather> weathers = forecasts.toJavaList(Weather.class);
        JSONObject now = json.getJSONObject("result").getJSONObject("now");
        Weather weather = weathers.get(0);
        weather.setTextNow(now.getString("text"));
        weather.setTemp(now.getString("temp"));
        weather.setWindClass(now.getString("wind_class"));
        weather.setWindDir(now.getString("wind_dir"));
        return weather;
    }
}
