package ua.tania.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Tania Nebesna on 27.03.2019
 */
@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
    private List<User> users;
}
