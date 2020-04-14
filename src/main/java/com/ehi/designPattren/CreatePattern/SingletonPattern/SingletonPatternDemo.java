package com.ehi.designPattren.CreatePattern.SingletonPattern;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:49
 * @Description: TODO
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        System.out.println(object1);
        System.out.println(object2);

    }

}
