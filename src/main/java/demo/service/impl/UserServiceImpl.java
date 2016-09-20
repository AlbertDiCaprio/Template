package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.GenericDao;
import demo.model.User;
import demo.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    @Autowired
    public UserServiceImpl(GenericDao<User, Integer> genericDao) {
        super(genericDao);
    }

    @Override
    public User login(User user) {
        return genericDao.query("user.login", user);
    }
}