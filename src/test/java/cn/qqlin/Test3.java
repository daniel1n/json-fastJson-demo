package cn.qqlin;

import cn.qqlin.model.test.JsonString;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @author lin.qingquan
 * @date 2020-10-23 15:15
 * @Description: 复杂json格式化字符串与JSONObject之间的转换
 */
public class Test3 {

    /**
     * 复杂json格式字符串到JSONObject的转换
     */
    @Test
    public void testComplexJSONStrToJSONObject() {
        JSONObject jsonObject = JSONObject.parseObject(JsonString.COMPLEX_JSON_STR);

        String teacherName = jsonObject.getString("teacherName");
        Integer teacherAge = jsonObject.getInteger("teacherAge");

        System.out.println("teacherName: " + teacherName + " teacherAge: " + teacherAge);

        JSONObject jsonObjectCourse = jsonObject.getJSONObject("course");
        // 获取JSONObject中的数据
        String courseName = jsonObjectCourse.getString("courseName");
        Integer code = jsonObjectCourse.getInteger("code");

        System.out.println("courseName " + courseName + " code: " + code);

        JSONArray jsonArrayStudents = jsonObject.getJSONArray("students");

        //遍历JSONArray
        for (Object object : jsonArrayStudents) {

            JSONObject jsonObjectOne = (JSONObject) object;
            String studentName = jsonObjectOne.getString("studentName");
            Integer studentAge = jsonObjectOne.getInteger("studentAge");

            System.out.println("studentName:  " + studentName + "   studentAge:  " + studentAge);
        }
    }

    /**
     * 复杂JSONObject到json格式字符串的替换
     */
    @Test
    public void testJSONObjectToComplexJSONStr() {
        // 复杂JSONObject，目标要替换为json字符串
        JSONObject jsonObject = JSONObject.parseObject(JsonString.COMPLEX_JSON_STR);

        // 第一种方式
        // String jsonString = JSONObject.toJSONString(jsonObject);

        // 第二种方式
        String jsonString = jsonObject.toJSONString(jsonObject);
        System.out.println(jsonString);
    }
}
