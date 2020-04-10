package com.ehi.DesignPattren.BehavioralPattern.MediatorPattern;

import java.util.Date;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:58
 * @Description: 创建中介类
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
