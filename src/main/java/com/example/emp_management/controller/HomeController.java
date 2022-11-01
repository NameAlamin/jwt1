package com.example.emp_management.controller;

import com.example.emp_management.model.EmpRegistration;
import com.example.emp_management.service.EmpRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private final EmpRegistrationService empRegistrationService;

    public HomeController(EmpRegistrationService empRegistrationService) {
        this.empRegistrationService = empRegistrationService;
    }

    @GetMapping("/")
    public String showHome(Model model){
        return "index";
    }

    @GetMapping("/reg_form")
    public String loginPage(Model model){
        EmpRegistration empRegistration = new EmpRegistration();
        model.addAttribute("empRegistration",empRegistration);
        return "reg_form";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login_form";
    }

    @PostMapping("/store_emp_reg")
    public String saveEmp(Model model, @ModelAttribute EmpRegistration empRegistration){
        empRegistrationService.saveEmpRegInfo(empRegistration);
        model.addAttribute("empRegistration",empRegistration);
        return "index";
    }

}
