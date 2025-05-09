package org.islands.util;

import org.islands.model.IslandGrid;

import java.util.Random;

public final class RandomGridFiller {
    private RandomGridFiller() {
    }

    public static void fillWithRandomLandAndWater(IslandGrid grid) {
        Random random = new Random();
        for (int row = 0; row < grid.getRowsCount(); row++) {
            for (int cell = 0; cell < grid.getColumnsCount(); cell++) {
                int value = random.nextInt(2);
                grid.setCellValueAt(row, cell, value);
            }
        }
    }
}
