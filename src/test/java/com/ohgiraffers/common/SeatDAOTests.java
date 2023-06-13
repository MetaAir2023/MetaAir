package com.ohgiraffers.common;

import com.ohgiraffers.section01.java.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class SeatDAOTests {

    @Autowired
    private SeatDAO seatDAO;

    @Test
    public void testDelete1(){
        int key = 1;

        boolean result = seatDAO.delete(key);

        assertTrue(result);



    }
    @Test
    public void testDelete2(){
        int key = 4;

        boolean result = seatDAO.delete(key);

        assertFalse(result);



    }
}
