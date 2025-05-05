package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printMap(generateMap(10, 25));
    }

    public static int[][] generateMap(int rows, int cols) {

        int[][] map = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = random.nextInt(2);
            }
        }
        return map;
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

