package com.ehi.designPattren.BehavioralPattern.StrategyPattern.example2.model;

/**
 * ClassName: user
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:17
 * @Description: TODO
 */
public class User {

    private String userName;

    private String vipType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }
}