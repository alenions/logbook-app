package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {
    @Test
    public void getTwoHundredFiftyCharForSumary(){
        //arrange
        Note note = new Note();
        String sumary = "";
        note.setTitle("Titulo");
        for(int i=0;i<240;i++){
            sumary += "a";
        }
        note.setContent(sumary);
        //act
        sumary = note.getSumary();
        //assert
        assertEquals(240, sumary.length());
    }
}