package com.hsn.rozliczmysie.share;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ShareMapper {

    ShareDTO toDto(Share Share);

    @Mapping(target = "id", ignore = true)
    Share toEntity(ShareDTO ShareDTO);
}
