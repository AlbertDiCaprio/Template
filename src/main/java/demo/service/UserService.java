package demo.service;

import demo.model.User;

public interface UserService extends GenericService<User, Integer> {

    User login(User user);
}