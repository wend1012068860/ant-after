package com.example.antafter.entity;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */
public class Test {
    private int id;
    private String name;
    private String remarks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
