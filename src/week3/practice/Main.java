package week3.practice;

import java.util.Scanner;

public class Main {
    enum Level {
        EASY("3 + 5"), MEDIUM("30 * 10 + 23"), HARD("20 / 10 + 2 - 1");

        private  final String equation;

        Level(String equation) {
            this.equation = equation;
        }

        public String getEquation() {
            return equation;
        }
    }
    public static void main(String[] args) {
        // program 3 level: easy, medium. hard
        // easy; 3 + 5
        // medium: 30 * 10 + 23
        // hard: 20 / 10 + 2 - 1

        Level level = Level.EASY;
        System.out.println(level.getEquation());

    }
}
