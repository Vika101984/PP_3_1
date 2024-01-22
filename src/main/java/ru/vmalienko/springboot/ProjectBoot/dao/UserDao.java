package ru.vmalienko.springboot.ProjectBoot.dao;


import ru.vmalienko.springboot.ProjectBoot.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(long id);
}