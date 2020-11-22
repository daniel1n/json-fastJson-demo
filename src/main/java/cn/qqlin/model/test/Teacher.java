package cn.qqlin.model.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lin.qingquan
 * @date 2020-10-24 15:01
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String teacherName;
    private Integer teacherAge;
    private Course course;
    private List<Student> students;

}
