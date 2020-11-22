package cn.qqlin.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lin.qingquan
 * @date 2020-10-25 22:37
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private List<Account> accounts;
    private String alias;
    private String avatar;
    private String cas_user_id;
    private String city;
    private String company_id;
    private String country;
    private String created;
    private String creator_id;
    private String deleted;
    private String desc;
    private String dingding_userid;
    private String disable;
    private String disable_all;
    private String email;
    private String end_time;
    private String expire_datetime;
    private String extra;
    private List<Info> infos;
    private String iPad_imei;
    private String iPhone_imei;
    private String isRootUser;
    private String name;
    private String password;
    private String password_back;
    private String password_len;
    private String phone_imei;
    private String phone_mac;
    private String phone_number;
    private String phone_pad_key;
    private String province;
    private String qq_number;
    private String ref;
    private String start_time;
    private String system_id;
    private String systems;
    private String ukey;
    private String ukeypassword;
    private String updateon;
    private String use_type;
    private String user_alias;
    private String user_node_id;
    private String weibo_auth;
    private String weixin_auth;
    private String white_list;
}
