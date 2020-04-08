package com.ehi.json.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:28
 * @Description: TODO
 */
public class JacksonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        // 设置时区
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        // 日期类型格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        // 序列化所有参数，包括null
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
    }

    public static String bean2Json(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        try {
            return objectMapper.readValue(jsonStr, objClass);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
