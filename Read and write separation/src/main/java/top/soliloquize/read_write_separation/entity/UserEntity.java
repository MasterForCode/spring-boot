package top.soliloquize.read_write_separation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wb
 * @date 2019/7/16
 * 测试用户类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "user")
public class UserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6171110531081112401L;
    @Id
    private int id;
    @Column(length = 32)
    private String name;
    @Column(length = 16)
    private int age;

}
