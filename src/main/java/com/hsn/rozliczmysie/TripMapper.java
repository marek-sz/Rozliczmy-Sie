package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import com.hsn.rozliczmysie.model.Trip;
import org.mapstruct.Mapper;

@Mapper
public interface TripMapper {
    TripDTO tripToTripDTO(Trip trip);
}
