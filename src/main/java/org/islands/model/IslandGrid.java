package org.islands.model;

public class IslandGrid {
    private final int totalRows;
    private final int totalColumns;
    private final int[][] cellsOfGrid;

    public IslandGrid(int rows, int cols) {
        this.totalRows = rows;
        this.totalColumns = cols;
        this.cellsOfGrid = new int[rows][cols];
    }

    public int getCellValueAt(int rowIndex, int columnIndex) {
        return cellsOfGrid[rowIndex][columnIndex];
    }

    public void setCellValueAt(int rowIndex, int columnIndex, int newValue) {
        cellsOfGrid[rowIndex][columnIndex] = newValue;
    }

    public int getRowsCount() {
        return totalRows;
    }

    public int getColumnsCount() {
        return totalColumns;
    }
}
