package cn.qqlin.model.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lin.qingquan
 * @date 2020-10-24 15:12
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String courseName;
    private Integer code;
}
