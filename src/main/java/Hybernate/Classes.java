package Hybernate;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String description;
}
