package com.example.antafter.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */
public class JiNianRiUtil {
    public static int getLianAi(){
        return calculationLianAi("2019-04-23");
    }
    public static int getBirthday_w(){
        try {
            return calculationBirthday("1998-01-10");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int getBirthday_m(){
        try {
            return calculationBirthday("1996-01-24");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 计算生日天数
    public static int calculationBirthday(String clidate) throws ParseException {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cToday = Calendar.getInstance(); // 存今天
        Calendar cBirth = Calendar.getInstance(); // 存生日
        cBirth.setTime(myFormatter.parse(clidate)); // 设置生日
        cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); // 修改为本年
        int days;
        if (cBirth.get(Calendar.DAY_OF_YEAR) < cToday.get(Calendar.DAY_OF_YEAR)) {
            // 生日已经过了，要算明年的了
            days = cToday.getActualMaximum(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
            days += cBirth.get(Calendar.DAY_OF_YEAR);
        } else {
            // 生日还没过
            days = cBirth.get(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
        }
        // 输出结果
        if (days == 0) {
            return 0;
        } else {
            return days;
        }
    }

    // 计算天数
    public static int calculationLianAi(String date) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int day = 0;
        try {
            long time = System.currentTimeMillis() - simpleDateFormat.parse(date).getTime();
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }
}
