package top.zoick.dao;

import top.zoick.domain.User;
import top.zoick.mybatis.annotation.Select;

import java.util.List;

/**
 * @author zoick
 * @date 2019/7/4 17:34
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}