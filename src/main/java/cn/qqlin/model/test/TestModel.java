package cn.qqlin.model.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lin.qingquan
 * @date 2020-10-24 14:36
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestModel {
    private String id;
    private String name;
    private String passWord;
}
