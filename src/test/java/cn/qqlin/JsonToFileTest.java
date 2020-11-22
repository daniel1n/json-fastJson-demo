package cn.qqlin;

import cn.qqlin.model.test.TestModel;
import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

/**
 * @author lin.qingquan
 * @date 2020-10-24 14:47
 * @Description:
 */
public class JsonToFileTest {
    @Test
    public void JsonFileToSqlFile() throws IOException {
        InputStream inputStream = new FileInputStream("src/main/resources/test.json");
        String text = IOUtils.toString(inputStream, "utf8");
        List<TestModel> s = JSON.parseArray(text, TestModel.class);
        String path = "src/main/resources/sql.txt";
        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path, true))
        );

        for (TestModel d : s) {
            String SQL = "insert into test(ID,NAME, PASSWORD)"
                    + "VALUES('" + d.getId() + "','" + d.getName() + "','"
                    + d.getPassWord() + "')";
            System.out.println(SQL);
            out.write(SQL);
            out.write("\n");
            out.flush();
        }
        out.close();
    }
}
