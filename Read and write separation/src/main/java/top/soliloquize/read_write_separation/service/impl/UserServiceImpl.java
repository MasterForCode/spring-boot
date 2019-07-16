package top.soliloquize.read_write_separation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.soliloquize.read_write_separation.dao.UserRepository;
import top.soliloquize.read_write_separation.entity.UserEntity;
import top.soliloquize.read_write_separation.service.UserService;

import java.util.List;

/**
 * @author wb
 * @date 2019/7/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
