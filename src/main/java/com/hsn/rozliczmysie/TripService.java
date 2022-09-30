package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import com.hsn.rozliczmysie.model.Trip;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TripService {

    private final TripRepository tripRepository;
    private final TripMapper tripMapper;

    public List<TripDTO> getTrips() {
        return tripRepository.findAll().stream()
                .map(tripMapper::tripToTripDTO)
                .collect(Collectors.toList());
    }

    public void create(final TripDTO tripDTO) {
        final Trip trip = tripMapper.toTrip(tripDTO);
        tripRepository.save(trip);
    }
}
