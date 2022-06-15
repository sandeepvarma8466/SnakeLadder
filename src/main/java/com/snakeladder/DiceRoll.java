package com.snakeladder;

public class DiceRoll {
    public static void main(String[] args) {
        int max = 6, min = 1;
        int diceRoll = (int) (Math.random() * max - min + 1) + min;
        System.out.println("Player Rolling Die gives : " +diceRoll);
    }
}
