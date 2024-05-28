package com.ronaldsm.preparcial.Controller;

import com.ronaldsm.preparcial.Model.User.User;
import com.ronaldsm.preparcial.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String Login(){ return "Login from public endpoint";}

    @PostMapping("/register")
    public String Register(){ return "Register from public endpoint";}

//    @PostMapping("/user/")
//    public User createUser(@RequestBody User user){
//        return userService.createUser(user);
//    }

//    @GetMapping("/user/all")
//    public List<UserListDTO> listUser(){
//        return userService.listUsers();
//    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User userById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PatchMapping("/user/change-password")
    public void changePassword(){
    }

    @PatchMapping("/user/toggle-active/{id}")
    @ResponseBody
    public User toggleActive(@PathVariable Long id) {
        {
            return userService.toggleIsActive(id);
        }
    }

//    @PostMapping("/auth/signin")
//    public UserDTO loginByEmail(@RequestBody User user){
//        return userService.signInByEmail(user.getEmail(), user.getPassword());
//    }

//    @PostMapping("/demo")
//    public String demo(){
//        return "Hello World";
//    }

//    @PostMapping("/auth/signin")
//    public User loginByUsername(@RequestBody User user){
//        return userService.signInByusername(user.getusername(), user.getPassword());
//    }


}
