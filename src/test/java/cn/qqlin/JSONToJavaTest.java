package cn.qqlin;

import cn.qqlin.model.test.Student;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

import static cn.qqlin.model.test.JsonString.JSON_OBJ_STR;

/**
 * @author lin.qingquan
 * @date 2020-10-23 16:48
 * @Description:
 */
public class JSONToJavaTest {

    /**
     * json字符串-简单对象到JavaBean之间的转换
     */

    @Test
    public void testJSONStrToJavaBeanObj() {
        // 第一种方式
        JSONObject jsonObject = JSONObject.parseObject(JSON_OBJ_STR);

        String studentName = jsonObject.getString("studentName");
        Integer studentAge = jsonObject.getInteger("studentAge");

        // Student student = new Student(studentName, studentAge);

        // 第二种方式，使用TypeReference<T>类，由于其构造方式使用protected进行修饰，股创建其子类
        // Student student = JSONObject.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});

        //第三种方式,使用Gson的思想
        Student student = JSONObject.parseObject(JSON_OBJ_STR, Student.class);

        System.out.println(student.toString());
    }

    /**
     * JavaBean到json字符串-简单对象的转换
     */
    @Test
    public void testJavaBeanObjectToJSONStr() {
        Student student = new Student("lily", 12);
        String jsonString = JSONObject.toJSONString(student);
        System.out.println(jsonString);
    }
}
