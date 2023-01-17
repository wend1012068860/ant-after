package com.example.antafter.enums;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/17
 * @description:
 */
public enum  AreaEnum {
    HUAIAN("320812", "淮安"),
    NANJING("320100", "南京"),
    NANJING_YUHUATAI("320114", "江苏省南京市雨花台区"),
    XUZHOU_FENGXIAN("320321", "江苏省徐州丰县")

    ;

    private String areaCode;
    private String desc;

    AreaEnum(String areaCode, String desc) {
        this.areaCode = areaCode;
        this.desc = desc;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
