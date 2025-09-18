package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface ShipObserver { // Interface for notification when ships are sunk
    void onShipSunk(Ship ship);
}