package com.jensen.reflect.cons;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp2 implements UserService {
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
        users.add(new User("熊大","123"));
        users.add(new User("熊二","123"));
        users.add(new User("熊三","123"));
        users.add(new User("熊四","123"));
        return users;
    }
}
