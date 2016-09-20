package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    private String login(User user) {
        user = userService.login(user);
        if (user != null) {
            session.setAttribute("user", user);
            if (user.getRole().equals("admin")) {
                return "redirect:/admin.jsp";
            }
            if (user.getRole().equals("user")) {
                return "redirect:/user.jsp";
            }
        }
        request.setAttribute("message", "invalid username or password.");
        return "/index.jsp";
    }
}