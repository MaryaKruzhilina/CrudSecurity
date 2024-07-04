package ru.maryKr.bootCrud.service;

import ru.maryKr.bootCrud.model.User;

import java.util.List;

public interface AdminService {
    User findByUsername(String username);
    boolean isNotUsernameUnique(String username);
    void addUser(User user);
    void removeUser(long id);
    List<User> getUsers();
    User getUser(long id);
}
