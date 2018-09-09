package ei.aliyun;

import ei.aliyun.dao.UserDAO;
import ei.aliyun.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)//实例化这个类的时候启动springboot项目
@SpringBootTest              //入口类
public class TestUserDAO {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindAll(){
        List<User> users = userDAO.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
