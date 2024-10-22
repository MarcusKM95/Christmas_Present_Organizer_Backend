package com.example.christmasprojectbackend.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Lombok annotation to create all the getters, setters, equals, hash, and toString methods
@AllArgsConstructor // Lombok annotation to create the all arguments constructor
@NoArgsConstructor // Lombok annotation to create the no arguments constructor
@Entity // This will let JPA know that this class is an Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String email;
    private String phoneNumber;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private String password;
}
