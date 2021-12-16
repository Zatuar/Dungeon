import java.util.ArrayList;

public class Room {
    Monster roomMonster;
    ArrayList<Item> items = new ArrayList<>();

    public Room(int type) {
        if (type % 3 == 0 && type % 4 == 0) {
            roomMonster = new Barbarian();
        } else if (type % 4 == 0) {
            roomMonster = new Thief();
        } else if (type % 3 == 0) {
            roomMonster = new Troll();
        } else if (isPremier(type)) {
            roomMonster = new Sorcerer();
        } else {
            roomMonster = new Zombie();
        }
        if(type % 4 == 0 && type % 7 == 0){
            items.add(new HealthPotion());
            items.add(new StrengthPotion());
        }else if(type%7 == 0){
            items.add(new HealthPotion());
        }else if(type%4 == 0){
            items.add(new StrengthPotion());
        }
    }
    public boolean isPremier(int n) {
        boolean isPremier = true;
        if (n < 2) {
            isPremier = false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n != i && n % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }
    public Monster getRoomMonster(){
        return roomMonster;
    }
    public Item search(){
        if(items.size()==0){
            System.out.println("Nothing left to find");
            return null;
        }
        else{
            System.out.println("Congrats you have found : "+ items.get(0).getClass().getSimpleName());
            return items.remove(0);
        }
    }
}
