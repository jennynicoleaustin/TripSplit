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
public class GroupMember {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private int totalOwed;

    @OneToMany(mappedBy = "groupMember")
    private List<Expense> expenses;

} // GroupMember Class
