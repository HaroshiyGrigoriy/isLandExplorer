package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMap(5, 5)));

    }

    public static int[][] generateMap(int rows, int cols) {

        int[][] map = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map [i][j] = random.nextInt(2);
            }
        }
        return map;
    }
}

