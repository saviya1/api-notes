package com.example.apinotes.persistance.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.apinotes.persistance.model.etudiant;

public interface spring_jpa_repository extends JpaRepository<etudiant, Integer>{

}
