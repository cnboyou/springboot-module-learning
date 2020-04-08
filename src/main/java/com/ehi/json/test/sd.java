/*
package com.ehi.json.deadLock;

import com.ehi.json.dao.Person;
import com.ehi.json.utils.FastJsonUtils;
import com.ehi.json.utils.GsonUtils;
import com.ehi.json.utils.JacksonUtils;
import com.ehi.json.utils.JsonLibUtils;
import org.junit.runner.Runner;

*/
/**
 * ClassName: sd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:36
 * @Description: TODO
 *//*

@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class JsonDeserializeBenchmark {
    */
/**
     * 反序列化次数参数
     *//*

    @Param({"1000", "10000", "100000"})
    private int count;

    private String jsonStr;

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(JsonDeserializeBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(0)
                .build();
        Collection<RunResult> results =  new Runner(opt).run();
        ResultExporter.exportResult("JSON反序列化性能", results, "count", "秒");
    }

    @Benchmark
    public void JsonLib() {
        for (int i = 0; i < count; i++) {
            JsonLibUtils.json2Bean(jsonStr, Person.class);
        }
    }

    @Benchmark
    public void Gson() {
        for (int i = 0; i < count; i++) {
            GsonUtils.json2Bean(jsonStr, Person.class);
        }
    }

    @Benchmark
    public void FastJson() {
        for (int i = 0; i < count; i++) {
            FastJsonUtils.json2Bean(jsonStr, Person.class);
        }
    }

    @Benchmark
    public void Jackson() {
        for (int i = 0; i < count; i++) {
            JacksonUtils.json2Bean(jsonStr, Person.class);
        }
    }

    @Setup
    public void prepare() {
        jsonStr="{\"name\":\"邵同学\",\"fullName\":{\"firstName\":\"zjj_first\",\"middleName\":\"zjj_middle\",\"lastName\":\"zjj_last\"},\"age\":24,\"birthday\":null,\"hobbies\":[\"篮球\",\"游泳\",\"coding\"],\"clothes\":{\"shoes\":\"安踏\",\"trousers\":\"adidas\",\"coat\":\"Nike\"},\"friends\":[{\"name\":\"小明\",\"fullName\":{\"firstName\":\"xxx_first\",\"middleName\":\"xxx_middle\",\"lastName\":\"xxx_last\"},\"age\":24,\"birthday\":null,\"hobbies\":[\"篮球\",\"游泳\",\"coding\"],\"clothes\":{\"shoes\":\"安踏\",\"trousers\":\"adidas\",\"coat\":\"Nike\"},\"friends\":null},{\"name\":\"Tony\",\"fullName\":{\"firstName\":\"xxx_first\",\"middleName\":\"xxx_middle\",\"lastName\":\"xxx_last\"},\"age\":24,\"birthday\":null,\"hobbies\":[\"篮球\",\"游泳\",\"coding\"],\"clothes\":{\"shoes\":\"安踏\",\"trousers\":\"adidas\",\"coat\":\"Nike\"},\"friends\":null},{\"name\":\"陈小二\",\"fullName\":{\"firstName\":\"xxx_first\",\"middleName\":\"xxx_middle\",\"lastName\":\"xxx_last\"},\"age\":24,\"birthday\":null,\"hobbies\":[\"篮球\",\"游泳\",\"coding\"],\"clothes\":{\"shoes\":\"安踏\",\"trousers\":\"adidas\",\"coat\":\"Nike\"},\"friends\":null}]}";
    }

    @TearDown
    public void shutdown() {
    }
}
*/
