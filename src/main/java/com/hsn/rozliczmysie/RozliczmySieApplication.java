package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.trip.Trip;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.List;

@SpringBootApplication
public class RozliczmySieApplication {

    public static void main(String[] args) {
        SpringApplication.run(RozliczmySieApplication.class, args);
    }

}