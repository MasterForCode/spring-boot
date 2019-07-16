package top.soliloquize.read_write_separation.service;

import top.soliloquize.read_write_separation.entity.UserEntity;

import java.util.List;

/**
 * @author wb
 * @time 2019/7/16
 */
public interface UserService {
    void saveUser(UserEntity user);

    List<UserEntity> getUsers();

}
