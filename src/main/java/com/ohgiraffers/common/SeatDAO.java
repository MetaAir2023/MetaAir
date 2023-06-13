package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SeatDAO {

    private final Map<Integer, Seat> seatMap;

    public SeatDAO() {
        this.seatMap = new HashMap<>();

        this.seatMap.put(1, new Seat(1, "airline1", "이코노미", null));
        this.seatMap.put(2, new Seat(2, "airline2", "비즈니스", null));
        this.seatMap.put(3, new Seat(3, "airline3", "퍼스트", null));

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


    private boolean validateGrade(String grade, int amount) {
        boolean check = false;

        switch (grade){
            case "이코노미": check = amount>5000 ? true : false;
            case "비즈니스": check = amount>=5000 && amount<10000 ? true : false;
            case "퍼스트": check = amount>=10000  ? true : false;
        }
        return check;
    }
    public Seat search(int sequence) { return seatMap.get(sequence); }

    public boolean check(int sequence, int amount, String userName) {

        Seat seat = this.search(sequence);
        boolean validateGrade = this.validateGrade(seat.getGrade(), amount);
        if(! validateGrade) {
            throw new IllegalArgumentException("입력한 금액이 적습니다!!!");
        }
        seat.setUserName(userName);
        System.out.println(seat.toString());

        return seat.getUserName() == userName ;
    }



}
