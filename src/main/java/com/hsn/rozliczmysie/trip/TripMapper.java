package com.hsn.rozliczmysie.trip;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripMapper {

    TripDTO toDto(Trip trip);

    @Mapping(target = "id", ignore = true)
    Trip toEntity(TripDTO tripDTO);
}
