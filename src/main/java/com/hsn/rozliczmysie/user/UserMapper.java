package com.hsn.rozliczmysie.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User User);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserDTO UserDTO);
}