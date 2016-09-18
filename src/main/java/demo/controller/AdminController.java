package demo.controller;

import demo.model.Admin;
import demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    private String create(Admin admin) {
        admin = adminService.login(admin);
        if (admin != null) {
            session.setAttribute("admin", admin);
            return "redirect:/admin.jsp";
        }
        request.setAttribute("message", "invalid username or password.");
        return "/index.jsp";
    }
}