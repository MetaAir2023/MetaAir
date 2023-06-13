package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SeatDAO {

    private final Map<Integer, Seat> seatMap;

    public SeatDAO() {
        this.seatMap = new HashMap<>();

        this.seatMap.put(1, new Seat(1, "airline1", "이코노미"));
        this.seatMap.put(2, new Seat(2, "airline2", "비즈니스"));
        this.seatMap.put(3, new Seat(3, "airline3", "퍼스트"));

    }
}
