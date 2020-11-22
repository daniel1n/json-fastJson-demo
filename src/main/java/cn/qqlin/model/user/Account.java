package cn.qqlin.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lin.qingquan
 * @date 2020-10-25 22:39
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String secret;
    private String type;
}
