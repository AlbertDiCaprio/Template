package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.GenericDao;
import demo.model.Admin;
import demo.service.AdminService;

@Service
public class AdminServiceImpl extends GenericServiceImpl<Admin, Integer> implements AdminService {

    @Autowired
    public AdminServiceImpl(GenericDao<Admin, Integer> genericDao) {
        super(genericDao);
    }

    @Override
    public Admin login(Admin admin) {
        return genericDao.query("admin.login", admin);
    }
}