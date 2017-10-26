package com.agioe.dao;

import com.agioe.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhye on 2017/10/25.
 */
@Mapper
public interface UserDAO  extends JpaRepository<User, String> {
}
