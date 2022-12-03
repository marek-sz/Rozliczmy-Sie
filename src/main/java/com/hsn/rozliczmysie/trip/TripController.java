package com.hsn.rozliczmysie.trip;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TripController {

    private final TripService tripService;

    @PostMapping("api/trips")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @NonNull TripDTO tripDTO) {
        log.info("Creating new trip...");
        tripService.create(tripDTO);
    }

    @GetMapping("api/trips")
    @ResponseStatus(HttpStatus.OK)
    public List<TripDTO> getTrips() {
        return tripService.getTrips();
    }

    @GetMapping("api/trips/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TripDTO getTrips(@PathVariable @NonNull Long id) {
        return tripService.getTrip(id);
    }
}
