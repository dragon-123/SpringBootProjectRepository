package ei.aliyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ei.aliyun.dao")//指定dao接口所在的包
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }
}
