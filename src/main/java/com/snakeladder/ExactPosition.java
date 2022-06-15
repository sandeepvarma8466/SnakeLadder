package com.snakeladder;

public class ExactPosition {
    public static void main(String[] args) {
        int position = 0, winPosition = 100;
        while (position != winPosition) {
            int diceRoll = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("Player Rolling Die Gives : " +diceRoll);
            int option = (int) (Math.random() * 10) % 2;
            switch (option) {
                case 0:
                    position = position + diceRoll;
                    System.out.println("player moves ahead by the number of position received in the die : " +position);
                    break;
                case 1:
                    position = position - diceRoll;
                    System.out.println("player moves behind by the number of position received in the die : " +position);
                    break;
                default:
                    System.out.println("Exit");
            }
        }
        System.out.println("Player win the game at position : " +position);
    }
}
