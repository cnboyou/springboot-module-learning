package com.ehi.designMode.StrategyPattern.example2.factory;

import com.ehi.designMode.StrategyPattern.example2.strategy.UserPayStrategy;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:11
 * @Description: TODO
 */
public class UserPayServiceStrategyFactory  {

    private static Map<String,UserPayStrategy> services = new ConcurrentHashMap<String,UserPayStrategy>();

    public  static UserPayStrategy getByUserType(String type){
        return services.get(type);
    }

    public static void register(String userType,UserPayStrategy userPayService){
        Assert.notNull(userType,"userType can't be null");
        services.put(userType,userPayService);
    }

}