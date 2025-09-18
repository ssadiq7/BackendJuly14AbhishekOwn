package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class BattleshipFactory implements ShipFactory { // Factory design pattern implementation for creating instances of different ship types
    @Override public Ship createShip(String shipType) {
        switch(shipType) {
            case "AIRCRAFT_CARRIER": return new AircraftCarrier();
            case "BATTLESHIP": return new Battleship();
            case "SUBMARINE": return new Submarine();
            case "DESTROYER": return new Destroyer();
            case "PATROL_BOAT": return new PatrolBoat();
            default: throw new IllegalArgumentException("Unknown ship type");
        }
    }
}