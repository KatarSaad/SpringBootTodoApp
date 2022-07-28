package com.example.demo.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Type {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String type ;
    @JsonIgnore
    @OneToMany(mappedBy = "Type",cascade = CascadeType.ALL)
    private List<Todo> liste;


}