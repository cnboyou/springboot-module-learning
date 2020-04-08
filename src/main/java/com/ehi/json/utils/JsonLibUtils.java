package com.ehi.json.utils;

import net.sf.json.JSONObject;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:31
 * @Description: TODO
 */
public class JsonLibUtils {

    public static String bean2Json(Object obj) {
        JSONObject jsonObject = JSONObject.fromObject(obj);
        return jsonObject.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return (T) JSONObject.toBean(JSONObject.fromObject(jsonStr), objClass);
    }
}
