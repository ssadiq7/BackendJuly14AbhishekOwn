package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship implements Deployable, Damageable {
    private String name;
    private int size;
    private List<Cell> occupiedCells;

    public boolean isSunk() {
        return false;
    }

    public void occupyCells(List<Cell> cells) {

    }

    public String getName() {
        return name;
    }





    /*
    // Implement Observer Pattern for ship sinking notifications
    private List observers = new ArrayList<>();

    public void addObserver(ShipObserver observer) {
        observers.add(observer);
    }

    public void notifySunk() {
        for (ShipObserver observer : observers) {
            observer.onShipSunk(this);
        }
    }*/
}
