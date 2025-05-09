package org.islands;

import org.islands.cli.ConsoleGridPrinter;
import org.islands.model.IslandGrid;
import org.islands.util.IslandCounterService;
import org.islands.util.RandomGridFiller;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IslandGrid grid = new IslandGrid(72, 35);
        RandomGridFiller.fillWithRandomLandAndWater(grid);
        ConsoleGridPrinter.printToConsole(grid);
        System.out.println("Здесь - " + IslandCounterService.calculateIslandsNumber(grid) + " островов!");
    }
}

