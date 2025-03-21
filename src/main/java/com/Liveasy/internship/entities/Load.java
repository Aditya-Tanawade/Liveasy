package com.Liveasy.internship.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loadId;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "facility_id")
    private Facility facility;

    private String productType;
    private String truckType;
    private int noOfTrucks;
    private double weight;
    private String comment;
    private String shipperId;
    private LocalDate date;


}

