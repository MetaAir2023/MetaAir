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

    public Seat serch(int sequence){
        return seatMap.get(sequence);
    }
    public void allSearch(){
        for(int key:seatMap.keySet()){

//        System.out.println(seatMap.get(key));
        StringBuilder sb=new StringBuilder();
        sb.append("좌석번호 : ").append(seatMap.get(key).getSequence()).append("  항공사명 : ").append(seatMap.get(key).getAirlineName())
                .append("  grade : ").append(seatMap.get(key).getGrade()).append("\n");
        System.out.println((String.valueOf(sb)));
        }
    }

}
