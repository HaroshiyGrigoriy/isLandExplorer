package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] map = generateMap(5, 10);
        printMap(map);
        System.out.println("Столько здесь островов - " +countIslands(map) + "!");

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

    public static int countIslands(int[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    dfs(map, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] map, int i, int j) {
        if (i < 0 || i >= map.length || j < 0 || j >= map[i].length || map[i][j] == 0) {
            return;
        }
        map[i][j] = 0;
        dfs(map, i - 1, j);
        dfs(map, i + 1, j);
        dfs(map, i, j - 1);
        dfs(map, i, j + 1);
    }
    }

