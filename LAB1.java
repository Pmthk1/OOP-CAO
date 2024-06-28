class Knight {
    String Name;
    int HP;
    int MP;

    void ShowDetails() {
        System.out.println("Name: " + Name);
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
    }

    void Attack() {
        System.out.println("Knight is attacking");
    }

    void Block() {
        System.out.println("Knight is blocking");
    }
}

class Mage {
    String Name;
    int HP;
    int MP;

    void ShowDetails() {
        System.out.println("Name: " + Name);
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
    }

    void Attack() {
        System.out.println("Mage is attacking");
    }

    void Block() {
        System.out.println("Mage is using magic");
    }
}

public class LAB1 {
    public static void main(String[] args) {
        
        Knight knight = new Knight();
        knight.Name = "Swordman";
        knight.HP = 100;
        knight.MP = 50;
        knight.ShowDetails();
        knight.Attack();
        knight.Block();
        System.out.println();

        
        Mage mage = new Mage();
        mage.Name = "Acolyte";
        mage.HP = 80;
        mage.MP = 100;
        mage.ShowDetails();
        mage.Attack();
        mage.Block();
        System.out.println();

        
        Knight novice = new Knight();
        novice.Name = "Novice";
        novice.HP = 50;
        novice.MP = 20;
        novice.ShowDetails();
        novice.Attack();
        novice.Block();
    }
}






