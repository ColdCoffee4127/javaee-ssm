package com.coffee.controller;

import com.coffee.pojo.Result;
import com.coffee.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
//    @RequestMapping("/login")
//    public String login(String username,String password,Model model) {
//        model.addAttribute("username", username);
//        System.out.println("password:"+password);
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String login(@RequestParam("username") String username,@RequestParam("password") String password,
//                        Model model) {
//        model.addAttribute("username", username);
//        System.out.println("password:"+password);
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String login(User user, Model model) {
//        model.addAttribute("username", user.getUsername());
//        System.out.println("password:"+user.getPassword());
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String login(@ModelAttribute("user1") User user) {
//        System.out.println("password--:"+user.getPassword());
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String login(Theday day, Model model) {
//        System.out.println("day:"+day.getBirthday());
//        return "index";
//    }
    @RequestMapping("/login1")
    public ModelAndView login(User user) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("user1", user);
        System.out.println(user.getUsername());
        return mav;
    }
//    @RequestMapping("/users")
//    @ResponseBody
//    public List<User> getUser() {
//        List<User> users = new ArrayList<>();
//        users.add(new User("张三","123"));
//        users.add(new User("李四","456"));
//        return users;
//    }
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result getUser(@RequestBody User user) {
        if("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            return new Result(1,"登录成功");
        }else{
            return new Result(0,"用户名或密码错误");
        }
    }
}
