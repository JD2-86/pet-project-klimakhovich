package dal.dao;

import dal.entity.UserEntity;

public interface UserDao {
    void save(UserEntity userEntity);


    UserEntity findByEmail(String email);
}
