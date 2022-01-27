package com.example.apinotes.persistance.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "etudiant")
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String idEtudaiant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdEtudaiant() {
        return idEtudaiant;
    }

    public void setIdEtudaiant(String idEtudaiant) {
        this.idEtudaiant = idEtudaiant;
    }
}
