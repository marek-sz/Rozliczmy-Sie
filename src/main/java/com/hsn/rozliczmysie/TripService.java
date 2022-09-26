package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
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
        Long userId = 1L;

        return tripRepository.findByUserId(userId).stream()
                .map(tripMapper::tripToTripDTO)
                .collect(Collectors.toList());
    }
}
