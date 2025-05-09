package org.islands.cli;

import org.islands.model.IslandGrid;

public final class ConsoleGridPrinter {
    private ConsoleGridPrinter (){}

    public static void printToConsole(IslandGrid grid) {
        for (int row = 0; row < grid.getRowsCount(); row++) {
            for (int col = 0; col < grid.getColumnsCount(); col++) {
                System.out.print(grid.getCellValueAt(row, col) + " ");
            }
            System.out.println();
        }
    }
}
