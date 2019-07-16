package top.soliloquize.read_write_separation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.soliloquize.read_write_separation.entity.UserEntity;

/**
 * @author wb
 * @date 2019/7/16
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}