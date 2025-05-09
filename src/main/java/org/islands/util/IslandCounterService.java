package org.islands.util;

import org.islands.model.IslandGrid;

public final class IslandCounterService {
    private IslandCounterService() {
    }

    public static int calculateIslandsNumber(IslandGrid grid) {
        int rows = grid.getRowsCount();
        int cols = grid.getColumnsCount();
        boolean[][] visited = new boolean[rows][cols];
        int islandsFound = 0;
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid.getCellValueAt(row, col) == 1 && !visited[row][col]) {
                    islandsFound++;
                    floodFill(grid, row, col, visited, dRow, dCol);
                }
            }
        }
        return islandsFound;
    }

    private static void floodFill(IslandGrid grid, int row, int col, boolean[][] visited, int[] dRow, int[] dCol) {
        visited[row][col] = true;
        for (int k = 0; k < 4; k++) {
            int nRow = row + dRow[k];
            int nCol = col + dCol[k];

            boolean inside = nRow >= 0 && nRow < grid.getRowsCount()
                    && nCol >= 0 && nCol < grid.getColumnsCount();

            if (inside && grid.getCellValueAt(nRow, nCol) == 1 && !visited[nRow][nCol]) {
                floodFill(grid, nRow, nCol, visited, dRow, dCol);
            }
        }
    }
}
