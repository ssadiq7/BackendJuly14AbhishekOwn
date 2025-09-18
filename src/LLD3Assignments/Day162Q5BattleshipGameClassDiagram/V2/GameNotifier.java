package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class GameNotifier implements ShipObserver {
    @Override
    public void onShipSunk(Ship ship) {
        System.out.println("You sunk my " + ship.getName() + "!");
    }
}