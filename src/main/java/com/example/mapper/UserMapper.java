package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface UserMapper {
    User Sel(int id);
}
