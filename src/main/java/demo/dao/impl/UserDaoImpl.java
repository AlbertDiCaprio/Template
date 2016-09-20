package demo.dao.impl;

import org.springframework.stereotype.Repository;

import demo.dao.UserDao;
import demo.model.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}