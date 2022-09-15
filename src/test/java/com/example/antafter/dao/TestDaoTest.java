package com.example.antafter.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/9/15
 * @description:
 */

@SpringBootTest
class TestDaoTest {
    @Resource
    private TestDao testDao;

    @Test
    void getAll() {
        System.out.println(testDao.getAll());
    }
}