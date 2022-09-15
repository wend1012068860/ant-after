package com.example.antafter.dao;

import com.example.antafter.entity.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */

@Mapper
public interface TestDao {

    List<Test> getAll();
}
