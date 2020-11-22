package cn.qqlin;

import cn.qqlin.model.test.JsonString;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @author lin.qingquan
 * @date 2020-10-23 14:46
 * @Description: JSON格式字符串与JSON对象之间的转换
 */
public class Test1 {


    /**
     * json字符串-简单对象型到JSONObject的转换
     */
    @Test
    public void testJSONStrToJSONObject() {
        JSONObject jsonObject = JSONObject.parseObject(JsonString.JSON_OBJ_STR);

        System.out.println("studentName " + jsonObject.getString("studentName") + ":" + " studentAge:"
                + jsonObject.getInteger("studentAge"));
    }

    /**
     * JSONObject到json字符串-简单对象型的转换
     */
    @Test
    public void testJsonObjectToJSONStr() {
        // 已知JSONObject，目标要转换为json字符串
        JSONObject jsonobject = JSONObject.parseObject(JsonString.JSON_OBJ_STR);
        // 第一种方式
        String jsonString = JSONObject.toJSONString(jsonobject);

        // 第二种方式
        // String jsonString = jsonObject.toJSONString();
        System.out.println(jsonString);
    }
}
