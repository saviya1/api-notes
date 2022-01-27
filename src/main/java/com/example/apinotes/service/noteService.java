package com.example.apinotes.service;
import com.example.apinotes.persistance.repository.spring_jpa_repository;
import com.example.apinotes.persistance.model.etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class noteService {

    @Autowired private spring_jpa_repository repo;

public int claculNote(){
    Random rand = new Random();
    int min =1;
    int max =20;
    int i = rand.nextInt(max - min + 1) + min;

    return i ;
}

public String saveEtudiant(etudiant etudiant){
repo.save(etudiant);
return "success";
}
}
