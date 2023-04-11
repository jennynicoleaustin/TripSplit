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
public class TripGroup {


    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String groupName;

    @OneToMany(mappedBy = "tripGroup", cascade = CascadeType.ALL)
    private List<GroupMember> members;

    @OneToMany(mappedBy = "tripGroup", cascade = CascadeType.ALL)
    private List<Expense> expenses;

} // TripGroup Class
