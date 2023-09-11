package com.example.kurs.mapper;

import com.example.kurs.DTO.AddUserDTO;
import com.example.kurs.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User dtoToUser(AddUserDTO userDTO);
}
