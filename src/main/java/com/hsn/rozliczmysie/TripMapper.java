package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import com.hsn.rozliczmysie.model.Trip;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripMapper {

    TripDTO toDto(Trip trip);

    @Mapping(target = "id", ignore = true)
    Trip toEntity(TripDTO tripDTO);
}
