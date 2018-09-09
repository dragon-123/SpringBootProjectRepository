package ei.aliyun.service;

import ei.aliyun.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);
}
