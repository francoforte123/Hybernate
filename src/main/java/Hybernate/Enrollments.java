package Hybernate;

import lombok.Data;

import javax.persistence.*;

@Table
@Data
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    @JoinColumn(name = "Students_id", referencedColumnName = "id")
    private Students students;

    @ManyToMany
    @JoinColumn(name = "Classes_id", referencedColumnName = "id")
    private Classes classes;
}
