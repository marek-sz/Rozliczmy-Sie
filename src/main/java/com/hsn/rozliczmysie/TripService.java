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
                .map(tripMapper::toDto)
                .collect(Collectors.toList());
    }

    public TripDTO getTrip(final Long tripId) {
        return tripMapper.toDto(tripRepository.findById(tripId).orElseThrow());
    }

    public void create(final TripDTO tripDTO) {
        final Trip trip = tripMapper.toEntity(tripDTO);
        tripRepository.save(trip);
    }
}
