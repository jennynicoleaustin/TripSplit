package com.example.tripsplit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "expenses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int total;

    @Column
    private int splitAmount;

    @ManyToOne
    @JoinColumn(name = "trip_group_id", referencedColumnName = "id")
    private TripGroup tripGroup;



} // Expense
