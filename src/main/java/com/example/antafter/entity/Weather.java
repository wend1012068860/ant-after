package com.example.antafter.entity;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */
public class Weather {
    String wdNight;
    String date;
    String high;
    String week;
    String textNight;
    String wdDay;
    String low;
    String wcNight;
    String text_day;
    String wcDay;
    // 当前天气
    String textNow;
    // 当前温度
    String temp;
    // 风级大小
    String windClass;
    // 风向
    String windDir;

    public String getWdNight() {
        return wdNight;
    }

    public void setWdNight(String wdNight) {
        this.wdNight = wdNight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTextNight() {
        return textNight;
    }

    public void setTextNight(String textNight) {
        this.textNight = textNight;
    }

    public String getWdDay() {
        return wdDay;
    }

    public void setWdDay(String wdDay) {
        this.wdDay = wdDay;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getWcNight() {
        return wcNight;
    }

    public void setWcNight(String wcNight) {
        this.wcNight = wcNight;
    }

    public String getText_day() {
        return text_day;
    }

    public void setText_day(String text_day) {
        this.text_day = text_day;
    }

    public String getWcDay() {
        return wcDay;
    }

    public void setWcDay(String wcDay) {
        this.wcDay = wcDay;
    }

    public String getTextNow() {
        return textNow;
    }

    public void setTextNow(String textNow) {
        this.textNow = textNow;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWindClass() {
        return windClass;
    }

    public void setWindClass(String windClass) {
        this.windClass = windClass;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "wdNight='" + wdNight + '\'' +
                ", date='" + date + '\'' +
                ", high='" + high + '\'' +
                ", week='" + week + '\'' +
                ", textNight='" + textNight + '\'' +
                ", wdDay='" + wdDay + '\'' +
                ", low='" + low + '\'' +
                ", wcNight='" + wcNight + '\'' +
                ", text_day='" + text_day + '\'' +
                ", wcDay='" + wcDay + '\'' +
                ", textNow='" + textNow + '\'' +
                ", temp='" + temp + '\'' +
                ", windClass='" + windClass + '\'' +
                ", windDir='" + windDir + '\'' +
                '}';
    }
}
