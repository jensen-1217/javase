package com.jensen.reflect.cons;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }

    @Override
    public List<User> queryAllUser() {

        List<User> users=new ArrayList<>();
        users.add(new User("张三","123456"));
        users.add(new User("李四","123456"));
        users.add(new User("王五","123456"));
        users.add(new User("赵六","123456"));

        return users;
    }
}
