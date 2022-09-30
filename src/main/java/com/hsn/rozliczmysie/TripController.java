package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.TripDTO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TripController {

    private final TripService tripService;

    @PostMapping("api/trips")
    public void create(@RequestBody @NonNull TripDTO tripDTO) {
      log.info("Creating new trip...");
        tripService.create(tripDTO);
    }

    @GetMapping("api/trips")
    public List<TripDTO> getTrips() {
        return tripService.getTrips();
    }
}
