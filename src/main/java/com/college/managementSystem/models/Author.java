package com.college.managementSystem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Author_Table")
public class Author {

    // Author Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    // @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "author_sequence")
    // @SequenceGenerator(name = "author_sequence",sequenceName = "author_sequence" , allocationSize = 1)

    private Integer id; // define as primary key pk

    @Column(
        name="c_fName",
        length=35
    )
    private String firstName;

    @Column(
        name="c_lName",
        length=35

    )
    private String lastName;

    @Column(
        name="c_email",
        unique=true,
        nullable = false
    )
    private String email;

    @Column(
        name = "c_age"
    )
    private int age;

    @Column(
        name = "c_createdAt",
        updatable = false, // set to be only insert-able
        nullable = false
        
    )
    private LocalDateTime createdAt;

}
