package com.example.tripsplit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "group_members")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int totalOwed;

    @ManyToOne
    @JoinColumn(name = "trip_group_id", referencedColumnName = "id")
    private TripGroup tripGroup;

    @OneToMany(mappedBy = "GroupMember")
    private List<Expense> expenses;

} // GroupMember Class
