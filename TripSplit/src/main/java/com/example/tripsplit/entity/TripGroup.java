package com.example.tripsplit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "trip_groups")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TripGroup {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String groupName;

    @OneToMany(mappedBy = "tripGroup", cascade = CascadeType.ALL)
    private List<GroupMember> members;

    @OneToMany(mappedBy = "tripGroup", cascade = CascadeType.ALL)
    private List<Expense> expenses;

} // TripGroup Class
