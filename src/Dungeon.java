public class Dungeon {
    private Room[] nbRooms;

    public Dungeon(int nbRooms,boolean settings) {
        this.nbRooms= new Room[nbRooms];
        for (int i=0;i<nbRooms;i++){
            this.nbRooms[i]=new Room(i);
        }
            if(settings){
                int i=0;
                for (Room room: this.nbRooms) {
                    Monster m = room.getRoomMonster();
                    System.out.println(i+" : "+m.getClass().getSimpleName());
                    i++;
                }
        System.out.println("Thieves : "+ Monster.nbInstanceThief);
        System.out.println("Barbarians : "+ Monster.nbInstanceBarbarian);
        System.out.println("Sorcerers : "+ Monster.nbInstanceSorcerer);
        System.out.println("Trolls : "+ Monster.nbInstanceTroll);
        System.out.println("Zombies : "+ Monster.nbInstanceZombie);
        }
    }


    public Room getRoom(int nbRoom) {
        return nbRooms[nbRoom];
    }
}
