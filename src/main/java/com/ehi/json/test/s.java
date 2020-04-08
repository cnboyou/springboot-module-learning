/*
package com.ehi.json.deadLock;

import com.ehi.json.dao.FullName;
import com.ehi.json.dao.Person;
import com.ehi.json.utils.FastJsonUtils;
import com.ehi.json.utils.GsonUtils;
import com.ehi.json.utils.JacksonUtils;
import com.ehi.json.utils.JsonLibUtils;
import jdk.nashorn.internal.runtime.options.Options;
import org.junit.runner.Runner;

import javax.xml.ws.handler.MessageContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.thread.TimeUnit;

*/
/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:34
 * @Description: TODO
 *//*

@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(MessageContext.Scope.Benchmark)
public class JsonSerializeBenchmark {
    */
/**
     * 序列化次数参数
     *//*

    @Param({"1000", "10000", "100000"})
    private int count;

    private Person p;

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(JsonSerializeBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(0)
                .build();
        Collection<RunResult> results =  new Runner(opt).run();
        ResultExporter.exportResult("JSON序列化性能", results, "count", "秒");
    }

    @Benchmark
    public void JsonLib() {
        for (int i = 0; i < count; i++) {
            JsonLibUtils.bean2Json(p);
        }
    }

    @Benchmark
    public void Gson() {
        for (int i = 0; i < count; i++) {
            GsonUtils.bean2Json(p);
        }
    }

    @Benchmark
    public void FastJson() {
        for (int i = 0; i < count; i++) {
            FastJsonUtils.bean2Json(p);
        }
    }

    @Benchmark
    public void Jackson() {
        for (int i = 0; i < count; i++) {
            JacksonUtils.bean2Json(p);
        }
    }

    @Setup
    public void prepare() {
        List<Person> friends=new ArrayList<Person>();
        friends.add(createAPerson("小明",null));
        friends.add(createAPerson("Tony",null));
        friends.add(createAPerson("陈小二",null));
        p=createAPerson("邵同学",friends);
    }

    @TearDown
    public void shutdown() {
    }

    private Person createAPerson(String name,List<Person> friends) {
        Person newPerson=new Person();
        newPerson.setName(name);
        newPerson.setFullName(new FullName("zjj_first", "zjj_middle", "zjj_last"));
        newPerson.setAge(24);
        List<String> hobbies=new ArrayList<String>();
        hobbies.add("篮球");
        hobbies.add("游泳");
        hobbies.add("coding");
        newPerson.setHobbies(hobbies);
        Map<String,String> clothes=new HashMap<String, String>();
        clothes.put("coat", "Nike");
        clothes.put("trousers", "adidas");
        clothes.put("shoes", "安踏");
        newPerson.setClothes(clothes);
        newPerson.setFriends(friends);
        return newPerson;
    }
}
*/
