package ei.aliyun.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
import java.util.regex.Pattern;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class User {


    @JsonFormat(pattern = "userId")
    private String id;
    private String name;
    private Integer age;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date bir;


}
