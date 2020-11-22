package cn.qqlin;

import cn.qqlin.model.test.JsonString;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @author lin.qingquan
 * @date 2020-10-23 15:00
 * @Description: json字符串（数据类型）与JSONArray之间的转换
 */
public class Test2 {

    /**
     * json字符串-数组类型到JSONArray的转换
     */
    @Test
    public void testJSONStrToJSONArray() {
        JSONArray jsonArray = JSONArray.parseArray(JsonString.JSON_ARRAY_STR);

        // 遍历方式1
        int size = jsonArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println("student: " + jsonObject.getString("studentName") + ":" + " studentAge: "
                    + jsonObject.getInteger("studentAge"));
        }

        // 遍历方式2
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("studentName: " + jsonObject.getString("studentName") + ":" + " studentAge: "
                    + jsonObject.getInteger("studentAge"));
        }
    }

    /**
     * JSONArray 到json字符串-数组类型 转换
     */
    @Test
    public void testJsonArrayToJSONStr() {
        // 已知JSONArray,目标要转换为json字符串
        JSONArray jsonArray = JSONArray.parseArray(JsonString.JSON_ARRAY_STR);
        // 第一种方式
        String jsonString = JSONArray.toJSONString(jsonArray);

        // 第二种方式
        // String jsonString = jsonArray.toJSONString(jsonArray);
        System.out.println(jsonString);
    }
}
