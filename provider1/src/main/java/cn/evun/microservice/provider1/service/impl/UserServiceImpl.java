package cn.evun.microservice.provider1.service.impl;

import cn.evun.microservice.provider1.model.User;
import cn.evun.microservice.provider1.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User get(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("name :" + id);
        user.setPassword("password:" + id);
        user.setSourceId("provider1");
        return user;
    }
}
