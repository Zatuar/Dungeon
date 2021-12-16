import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Second parameter in Dungeon is to hide or show construction infors
        //In case of false, nothing is displayed
        Dungeon dungeon = new Dungeon(30, false);
        String option = myScanner.nextLine();

        //Check if the creation of potions and search room are implemented  as expected
        if (option.equals("RoomPotion")) {
            int nbRoom = myScanner.nextInt();
            Item item = null;
            do {
                item = dungeon.getRoom(nbRoom).search();
            } while (item != null);
            exit(0);
        }
    }
}
/*
    Scanner myScanner = new Scanner(System.in);
    String option = myScanner.nextLine();
//Check if Dungeons / Room / Monster... creation respect sequence diagram
        if (option.equals("Create Dungeon")) {
                int nbRooms = myScanner.nextInt();
                Dungeon dungeon = new Dungeon(nbRooms);
                exit(0);
                }*/