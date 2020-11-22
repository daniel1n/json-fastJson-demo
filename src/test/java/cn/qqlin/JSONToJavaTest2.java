package cn.qqlin;

import cn.qqlin.model.test.Student;
import cn.qqlin.model.test.Teacher;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static cn.qqlin.model.test.JsonString.COMPLEX_JSON_STR;
import static cn.qqlin.model.test.JsonString.JSON_ARRAY_STR;

/**
 * @author lin.qingquan
 * @date 2020-10-23 17:21
 * @Description: json字符串-数据类型与javaBean之间的转换
 */
public class JSONToJavaTest2 {

    /**
     * json字符串-数组类型到JavaBean_List的转换
     */
    @Test
    public void testJSONStrToJavaBeanList() {
        // 第一种方式
        JSONArray jsonArray = JSONArray.parseArray(JSON_ARRAY_STR);

        // 遍历JSONArray
        List<Student> students = new ArrayList<>();
        Student student = null;
        for (Object object :
                jsonArray) {
            JSONObject jsonObjectOne = (JSONObject) object;
            String studentName = jsonObjectOne.getString("studentName");
            Integer studentAge = jsonObjectOne.getInteger("studentAge");

            student = new Student(studentName, studentAge);
            students.add(student);
        }
        System.out.println("students: " + students);


        // 第二种方式，使用TypeReference<T>类，由于其构造方法使用protected进行修饰，故创建其子类
        List<Student> studentList = JSONArray.parseObject(JSON_ARRAY_STR, new TypeReference<ArrayList<Student>>() {
        });
        System.out.println("studentList: " + studentList);

        // 第三种方式，使用Gson的思想
        List<Student> studentList1 = JSONArray.parseArray(JSON_ARRAY_STR, Student.class);
        System.out.println("studentList:1 " + studentList1);
    }

    /**
     * JavaBean_List到json字符串-数组类型的转换
     */
    @Test
    public void testJavaBeanListToJSONStr() {
        Student student = new Student("lily", 12);
        Student studentTwo = new Student("lucy", 15);

        List<Student> students = new ArrayList<Student>();

        students.add(student);
        students.add(studentTwo);

        String jsonString = JSONArray.toJSONString(students);
        System.out.println(jsonString);
    }

    /**
     * 复杂json格式字符串与javaBean之间的转换
     */
    @Test
    public void testComplexJSONStrToJavaBean() {
        // 第一种方式，使用TypeReference<T>类，由于其构造方法使用protected进行修饰，故创建其子类
        Teacher teacher = JSONObject.parseObject(COMPLEX_JSON_STR, new TypeReference<Teacher>() {
        });
        System.out.println(teacher);

        // 第二种方式，使用Gson思想
        Teacher teacher1 = JSONObject.parseObject(COMPLEX_JSON_STR, Teacher.class);
        System.out.println(teacher1);
    }

    /**
     * 复杂JavaBean_obj到json格式字符串的转换
     */
    @Test
    public void testJavaBeanToComplexJSONSt() {
        //已知复杂JavaBean_obj
        Teacher teacher = JSONObject.parseObject(COMPLEX_JSON_STR, new TypeReference<Teacher>() {
        });
        String jsonString = JSONObject.toJSONString(teacher);
        System.out.println(jsonString);
    }

}
