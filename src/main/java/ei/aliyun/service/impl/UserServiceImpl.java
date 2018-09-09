package ei.aliyun.service.impl;

import ei.aliyun.dao.UserDAO;
import ei.aliyun.entity.User;
import ei.aliyun.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public List<User> findAll() {

        List<User> users = userDAO.findAll();

        return users;
    }
}
