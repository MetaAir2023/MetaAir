package com.ohgiraffers.common;

import com.ohgiraffers.section01.java.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class SetSeatDAOTests {

    @Autowired
    private SeatDAO seatDAO;

    @Test
    public void testCheck() {

        int sequence = 1;
        int amount = 10000;
        String userName = "박소연";

        boolean checkResult = seatDAO.check(sequence, amount, userName);
        assertTrue(checkResult);
    }





}
