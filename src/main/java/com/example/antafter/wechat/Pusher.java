package com.example.antafter.wechat;

import com.example.antafter.entity.Weather;
import com.example.antafter.utils.CaiHongPiUtil;
import com.example.antafter.utils.JiNianRiUtil;
import com.example.antafter.utils.WeatherUtil;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;

import java.util.Date;
import java.util.Map;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */
public class Pusher {
    public static void main(String[] args) {
        push();
    }

    public static void push(){
        //1,配置
        WxMpInMemoryConfigStorage wxStorage = new WxMpInMemoryConfigStorage();
        wxStorage.setAppId("wxbe0663e1506f4d1a");// appid
        wxStorage.setSecret("4717186dc0367aa51f17ba2e9e264e00");//appsecret
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxStorage);
        //推送消息
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
//                .toUser("o-ElF6joC-CNm6815Xr9p8kYtdrI") // m
                .toUser("o-ElF6uC2pjmC7Wy3D6rOjudx5J4") //w
                .templateId("24WUhV8O83JOEPkjAGP2D3v7R26BJ939bu6LEnXvg5Q")// 模板id
//                .url("https://www.baidu.com")// 点击模板消息要访问的网址
                .build();
        //3,如果是正式版发送消息，，这里需要配置你的信息
        Weather weather = WeatherUtil.getWeather();
        String caiHongPi = CaiHongPiUtil.getCaiHongPi();
        Map<String, String> map = CaiHongPiUtil.getEnsentence();
        templateMessage.addData(new WxMpTemplateData("riqi", weather.getDate() + "  "+ weather.getWeek() + "\n","#00BFFF"));

        templateMessage.addData(new WxMpTemplateData("tianqi",weather.getTextNow()+ "\n","#00FFFF"));
        templateMessage.addData(new WxMpTemplateData("low",weather.getLow() + "度" + "\n","#173177"));
        templateMessage.addData(new WxMpTemplateData("high",weather.getHigh() + "度" + "\n","#FF6347" ));
        templateMessage.addData(new WxMpTemplateData("lianai", JiNianRiUtil.getLianAi() + "天" + "\n","#FF1493"));
        templateMessage.addData(new WxMpTemplateData("birthday",JiNianRiUtil.getBirthday_m()+ "天" + "\n","#FFA500"));
        templateMessage.addData(new WxMpTemplateData("caihongpi","\n" + caiHongPi + "\n\n","#C71585"));
        templateMessage.addData(new WxMpTemplateData("english","\n" + map.get("en") + "\n","#C71585"));
        templateMessage.addData(new WxMpTemplateData("chinese","\n" + map.get("zh") + "\n","#C71585"));
        String beizhu = "❤";
        if(JiNianRiUtil.getLianAi() % 365 == 0){
            beizhu = "今天是恋爱" + (JiNianRiUtil.getLianAi() / 365) + "周年纪念日！";
        }
        if(JiNianRiUtil.getBirthday_m()  == 0){
            beizhu = "今天是宝贝生日，生日快乐呀！";
        }
        templateMessage.addData(new WxMpTemplateData("beizhu",beizhu + "\n","#FF0000"));
        try {
            String msg = wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
            System.out.println("推送成功:" + msg);
        } catch (Exception e) {
            System.out.println("推送失败：" + e.getMessage());
            e.printStackTrace();
        }
    }
}