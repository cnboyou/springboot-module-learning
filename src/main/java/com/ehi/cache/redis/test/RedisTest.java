package com.ehi.cache.redis.test;

import com.ehi.cache.redis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName: RedisTest
 *
 * @Author: WangYiHai
 * @Date: 2020/4/9 16:25
 * @Description: TODO
 */
public class RedisTest {
    @Autowired
    private static RedisUtil redisUti1;
    public static void main(String[] args){
        redisUti1.set("ada","wang");
    }


}