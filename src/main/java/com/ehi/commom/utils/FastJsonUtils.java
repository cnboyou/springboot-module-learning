package com.ehi.commom.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:27
 * @Description: TODO
 */
public class FastJsonUtils {
    private static final SerializerFeature[] features = {
            // 序列化所有参数，包括null
            SerializerFeature.WriteMapNullValue,
            // 日期类型格式
            SerializerFeature.WriteDateUseDateFormat
            // list字段如果为null，输出为[]，而不是null
            // SerializerFeature.WriteNullListAsEmpty,
            // 数值字段如果为null，输出为0，而不是null
            // SerializerFeature.WriteNullNumberAsZero,
            // Boolean字段如果为null，输出为false，而不是null
            // SerializerFeature.WriteNullBooleanAsFalse,
            // 字符类型字段如果为null，输出为""，而不是null
            // SerializerFeature.WriteNullStringAsEmpty
    };

    public static String bean2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static String bean2JsonFeatures(Object obj) {
        return JSON.toJSONString(obj, features);
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return JSON.parseObject(jsonStr, objClass);
    }
}
