package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Make constructors and other methode
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;

    
}
