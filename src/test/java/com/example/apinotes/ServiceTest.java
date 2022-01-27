package com.example.apinotes;
import org.apache.commons.lang3.Range;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.apinotes.service.noteService;

import java.util.List;
import java.util.Random;

public class ServiceTest {
    noteService monService = new noteService();


    @Test
    public void sommeTest(){

        int note = monService.claculNote();
        Range<Integer> validRange = Range.between(1,20);
        assertTrue(note <= 20 && note >= 1, "Valeur entre 1 et 20");



    }
}
