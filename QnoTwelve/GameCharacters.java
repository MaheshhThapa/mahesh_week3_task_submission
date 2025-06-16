class GameCharacter {
    String name;

    GameCharacter(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(name +" attacks..");
    }
}

class Warrior extends GameCharacter{

    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name +" melee attacks with his sword..");
    }
}

class Archer extends GameCharacter{
    int arrowCount;
    Archer(String name,int arrowCount){
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    void attack() {
        if (arrowCount > 0){
        System.out.println(name +" shoots his arrow..");
        arrowCount--;
        } else {
            System.out.println(name +" is out of arrows..");
        }
    }
}

    class Mage extends GameCharacter{
        int mana;
        Mage(String name,int mana){
            super(name);
            this.mana = mana;
        }
    
        @Override
        void attack() {
            if (mana > 0){
            System.out.println(name +" shoots a fireball..");
            mana -= 5;
            } else {
                System.out.println(name +" is out of mana..");
            }
        }
    
}


public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] chars = new GameCharacter[5];
        chars[0] = new Warrior("Bahubali");
        chars[1] = new Archer("John", 0);
        chars[2] = new Archer("Tim", 3);
        chars[3] = new Mage("Harry", 0);
        chars[4] = new Mage("Tim Cook",200);

        chars[0].attack();
        chars[1].attack();
        chars[2].attack();
        chars[3].attack();
        chars[4].attack();
    }
}


