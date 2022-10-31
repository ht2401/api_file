package model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Table
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    private String password;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
