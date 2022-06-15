package com.snakeladder;

public class StartSnakeLadder {

    public static void main(String[] args) {
        int position = 0;
        int max = 6, min = 1;
        int ladder, snake;

        int diceRoll = (int) (Math.random() * max - min + 1) + 1;
        System.out.println("Player Rolling Die Gives : " +diceRoll);
        int option = (int) (Math.random() * 10) % 3;
        System.out.println("Player check for option : " +option);
        switch (option) {
            case 0:
                ladder = position + diceRoll;
                System.out.println("player moves ahead by the number of position received in the die : " +ladder);
                break;
            case 1:
                snake = position - diceRoll;
                System.out.println("player moves behind by the number of position received in the die : " +snake);
                break;
            case 2:
                System.out.println("The player stays in the same position : " +position);
                break;
            default:
                System.out.println("exit");

        }
    }
}
