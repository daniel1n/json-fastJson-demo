package cn.qqlin.user;

import cn.qqlin.model.user.User;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

/**
 * @author lin.qingquan
 * @date 2020-10-25 12:39
 * @Description:
 */
public class JsonToFileTest {

    @Test
    public void UserJsonToSQLFile() throws Exception {
        File userJsonFile = new File("src/main/resources/test1.json");
//        File userJsonFile = new File("src/main/resources/user.json");
        InputStream userInputStream = new FileInputStream(userJsonFile);

        String jsonString = IOUtils.toString(userInputStream, "utf8");
        List<User> users = JSONObject.parseArray(jsonString, User.class);

        String path = "src/main/resources/userSql.sql";
        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path, true))
        );

        for (User user : users) {
            String SQL = "insert into user(name, password, alias) "
                    + "VALUES('" + user.getName() + "','"
                    + user.getPassword() + "','" + user.getAlias() + "')";
            System.out.println(SQL);
            out.write(SQL);
            out.write("\n");
            out.flush();
        }

    }
}
