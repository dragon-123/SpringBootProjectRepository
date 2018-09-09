package ei.aliyun.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class User {


    private String id;
    private String name;
    private Integer age;
    private Date bir;


}
