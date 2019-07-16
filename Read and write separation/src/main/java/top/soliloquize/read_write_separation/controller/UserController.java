package top.soliloquize.read_write_separation.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.soliloquize.read_write_separation.entity.UserEntity;
import top.soliloquize.read_write_separation.service.UserService;

import java.util.List;

/**
 * @author wb
 * @date 2019/7/16
 * 用户测试类控制器
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String saveUser() {
        UserEntity user = new UserEntity(1, "张三", 22);
        userService.saveUser(user);
        return "success";
    }

    @GetMapping("/getUser")
    public String getUsers() {
        List<UserEntity> users = userService.getUsers();
        return new Gson().toJson(users);
    }

}
