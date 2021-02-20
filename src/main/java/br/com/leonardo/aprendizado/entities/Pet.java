package br.com.leonardo.aprendizado.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String breed;

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false, referencedColumnName = "id")
    private Person person;


}
