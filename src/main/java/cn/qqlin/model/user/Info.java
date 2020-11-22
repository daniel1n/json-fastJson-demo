package cn.qqlin.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lin.qingquan
 * @date 2020-10-25 23:02
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String nickname;
    private String office_number;
    private String gender;
    private String work_experience;
    private String title;
    private String position;
    private String sex;
}
