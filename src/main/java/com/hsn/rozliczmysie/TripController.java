package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
@RequiredArgsConstructor
public class TripController {

    private final TripService tripService;

    @GetMapping("/my-trips")
    public List<TripDTO> getTrips() {
        return tripService.getTrips();
    }
}
