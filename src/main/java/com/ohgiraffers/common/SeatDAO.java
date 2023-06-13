package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Repository
public class SeatDAO {
    Scanner sc = new Scanner(System.in);
    private final Map<Integer, Seat> seatMap;

    public SeatDAO() {
        this.seatMap = new HashMap<>();

        this.seatMap.put(1, new Seat(1, "airline1", "이코노미", null));
        this.seatMap.put(2, new Seat(2, "airline2", "비즈니스", null));
        this.seatMap.put(3, new Seat(3, "airline3", "퍼스트", null));

    }

    public boolean delete(int key){

        int before = seatMap.size();

        seatMap.remove(key);
        int after = seatMap.size();

        return  after < before;



    }
}
