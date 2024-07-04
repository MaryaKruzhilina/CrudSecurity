package ru.maryKr.bootCrud.service;

import ru.maryKr.bootCrud.model.User;

public interface UserService {
    User findByUsername(String username);
}
