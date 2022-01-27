package com.example.apinotes.controller;
import java.util.Random;

import com.example.apinotes.persistance.model.etudiant;
import com.example.apinotes.service.noteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.apinotes.persistance.model.etudiant;

@Controller
public class noteController {

    @Autowired private noteService service;
    private Object etudiant;


    @GetMapping("/note")
    public int getUser(String id){
        return service.claculNote();
    }


    @PostMapping("/users/save")
    public  String saveUser(etudiant etudiant){
      return  service.saveEtudiant(etudiant);

    }


}
