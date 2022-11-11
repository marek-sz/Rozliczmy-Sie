package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import com.hsn.rozliczmysie.model.Trip;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TripMapper {
    TripDTO toDto(Trip trip);
    Trip toEntity(TripDTO tripDTO);
}
