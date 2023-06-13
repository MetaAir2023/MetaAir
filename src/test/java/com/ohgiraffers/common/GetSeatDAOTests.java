package com.ohgiraffers.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetSeatDAOTests {
    private SeatDAO seatDAO;
    @BeforeEach
    public void setup(){
        seatDAO=new SeatDAO();
    }
    @Test
    public void serchTest(){
        //given
        int sequenc=1;
        //when

        Seat tmp=seatDAO.serch(sequenc);


        //then
       assertEquals("이코노미",tmp.getGrade());
    }

    @Test
    public void allSerchTest(){
        //given
        //when
        seatDAO.allSearch();
        //then

    }
}
