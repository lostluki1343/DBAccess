package at.ac.htlstp.et.sj24k5b.dbaccess.controller;

import at.ac.htlstp.et.sj24k5b.dbaccess.service.MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired private MysqlService mysqlService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("ct",mysqlService.teste());
        model.addAttribute("msg","Hello World");
        return "home";
    }
}
