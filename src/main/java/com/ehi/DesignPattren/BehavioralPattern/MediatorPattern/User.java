package com.ehi.DesignPattren.BehavioralPattern.MediatorPattern;

/**
 * ClassName: Js
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:59
 * @Description: TODO
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}
