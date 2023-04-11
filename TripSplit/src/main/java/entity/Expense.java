package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
    private int total;
    private int splitAmount;

    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL)
    private List<GroupMember> members;

} // Expense
