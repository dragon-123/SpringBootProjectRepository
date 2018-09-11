package ei.aliyun;

import ei.aliyun.entity.User;
import org.junit.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

public class TestJsonTo {

    @Test
    public void testJson(){
        //简单类型
        User user = new User();
        user.setId("123");
        user.setName("xuwenlong");
        user.setAge(23);
        user.setBir(new Date());


        String userJson = JsonMapper.objectToJson(user);
        System.out.println(userJson);

        String userJ = JsonMapper.objectToJsonPretty(user);
        System.out.println(userJ);


    }

}
