package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

import java.util.List;

public class Player {
    private String name;
    private Board ownBoard;
    private Board opponentsBoard;
    private List<Ship> fleet;

    public void deployShip(Board ownBoard, Ship ship, PlacingType placingType) {
        // Logic to place the ship on the board based on placingType (HORIZONTAL or VERTICAL)
    }
    public ShotType fireShot(Cell cell) {
        // Logic to fire a shot at the opponent's board and return the result (HIT, MISS, SUNK)
        return null; // Placeholder return
    }
    public boolean isAllShipsSunk() {
        // Check if all ships in the fleet are sunk
        return false; // Placeholder return
    }
}
