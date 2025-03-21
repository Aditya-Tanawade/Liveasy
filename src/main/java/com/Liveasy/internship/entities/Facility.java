package com.Liveasy.internship.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loadingPoint;
    private String unloadingPoint;
    private LocalDate loadingDate;
    private LocalDate unloadingDate;



}
