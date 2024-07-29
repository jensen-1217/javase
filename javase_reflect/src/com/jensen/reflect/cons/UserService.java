package com.jensen.reflect.cons;

import java.util.List;

public interface UserService {
    public boolean addUser(User user);

    public boolean deleteUser(Integer id);

    public List<User> queryAllUser();
}
