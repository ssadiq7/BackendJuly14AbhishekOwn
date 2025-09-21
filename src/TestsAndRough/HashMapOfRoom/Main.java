package TestsAndRough.HashMapOfRoom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Room, Integer> bookedRoomsQtyMap = new HashMap<>();

        Room room1 = new Room();
        room1.id = 1;
        room1.roomNumber = "101";
        room1.price = 100.0;
        room1.roomType = RoomType.SINGLE;
        room1.description = "Single room with one bed";

        Room room2 = new Room();
        room2.id = 2;
        room2.roomNumber = "102";
        room2.price = 150.0;
        room2.roomType = RoomType.DOUBLE;
        room2.description = "Double room with two beds";

        bookedRoomsQtyMap.put(room1, 5);
        bookedRoomsQtyMap.put(room2, 3);

        System.out.println("\nBooked Rooms Quantity Map: toString() representation");
        System.out.println(bookedRoomsQtyMap.toString());

        System.out.println("\n\nFor loop representation:");
        for (Map.Entry<Room, Integer> entry : bookedRoomsQtyMap.entrySet()) {
            Room room = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println("Room Number: " + room.roomNumber + ", Quantity Booked: " + quantity);
        }

        // This is how the HashMap would look in JSON format
        System.out.println("\n\nJSON representation:");
        System.out.println("{");
        for (Map.Entry<Room, Integer> entry : bookedRoomsQtyMap.entrySet()) {
            Room room = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println("  \"" + room.roomNumber + "\": " + quantity + ",");
        }
        System.out.println("}");


        System.out.println("\n\nDirectly printing the HashMap:");
        System.out.println(bookedRoomsQtyMap); // This will call the toString() method of HashMap




        System.out.println("\n\n\n\n\n\n");

        Customer customer1 = new Customer("John Doe");
        customer1.id = 1;

        Customer customer2 = new Customer("Test User");
        customer2.id = 2;

        Map<Customer, Room> customerRoomMap = new HashMap<>();
        customerRoomMap.put(customer1, room1);
        customerRoomMap.put(customer2, room2);

        System.out.println("\nBooked Rooms Quantity Map: toString() representation");
        System.out.println(customerRoomMap.toString());


        System.out.println("\n\nFor loop representation:");
        for (Map.Entry<Customer, Room> entry : customerRoomMap.entrySet()) {
            Customer customer = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Customer Name: " + customer.name + ", Room Number: " + room.roomNumber);
        }


        // This is how the HashMap would look in JSON format
        System.out.println("\n\nJSON representation:");
        System.out.println("{");
        for (Map.Entry<Customer, Room> entry : customerRoomMap.entrySet()) {
            Customer customer = entry.getKey();
            Room room = entry.getValue();
            System.out.println("  \"" + customer.name + "\": \"" + room.roomNumber + "\",");
        }
        System.out.println("}");


        // One customer can book multiple rooms
        System.out.println("\n\nOne customer can book multiple rooms:");
        Map<Customer, List<Room>> customerBookedRoomsMap = new HashMap<>();
        customerBookedRoomsMap.put(customer1, List.of(room1, room2));

        Room room3 = new Room();
        room3.id = 3;
        room3.roomNumber = "103";
        room3.price = 200.0;
        room3.roomType = RoomType.SUITE;
        room3.description = "Suite room with king bed and living area";
        customerBookedRoomsMap.put(customer2, List.of(room3));

        System.out.println("\nBooked Rooms Quantity Map: toString() representation");
        System.out.println(customerBookedRoomsMap.toString());

        System.out.println("\n\nFor loop representation:");
        for (Map.Entry<Customer, List<Room>> entry : customerBookedRoomsMap.entrySet()) {
            Customer customer = entry.getKey();
            List<Room> rooms = entry.getValue();
            System.out.print("Customer Name: " + customer.name + ", Room Numbers: [");
            /*for (Room room : rooms) {
                System.out.print(room.roomNumber + " ");
            }*/
            for (int i = 0; i < rooms.size(); i++) {
                System.out.print(rooms.get(i).roomNumber);
                if (i < rooms.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }




        System.out.println("\n\nJSON representation:");
        System.out.println("{");
        for (Map.Entry<Customer, List<Room>> entry : customerBookedRoomsMap.entrySet()) {
            Customer customer = entry.getKey();
            List<Room> rooms = entry.getValue();
            System.out.print("  \"" + customer.name + "\": [");
            for (int i = 0; i < rooms.size(); i++) {
                System.out.print("\"" + rooms.get(i).roomNumber + "\"");
                if (i < rooms.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("],");
        }
        System.out.println("}");

    }
}
