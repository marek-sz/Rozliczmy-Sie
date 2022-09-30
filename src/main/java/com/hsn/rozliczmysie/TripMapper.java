package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import com.hsn.rozliczmysie.model.Trip;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface TripMapper {
    TripDTO tripToTripDTO(Trip trip);
    Trip toTrip(TripDTO tripDTO);
}
