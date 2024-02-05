interface Character {
    void move();
    void attack();
    void useAbility();
}

class Warrior implements Character {
    @Override
    public void move() {
        System.out.println("Warrior is moving.");
    }

    @Override
    public void attack() {
        System.out.println("Warrior is attacking.");
    }

    @Override
    public void useAbility() {
        System.out.println("Warrior is using a special ability.");
    }
}

class Mage implements Character {
    @Override
    public void move() {
        System.out.println("Mage is moving.");
    }

    @Override
    public void attack() {
        System.out.println("Mage is casting a spell.");
    }

    @Override
    public void useAbility() {
        System.out.println("Mage is using a magical ability.");
    }
}

class Rogue implements Character {
    @Override
    public void move() {
        System.out.println("Rogue is sneaking.");
    }

    @Override
    public void attack() {
        System.out.println("Rogue is performing a sneak attack.");
    }

    @Override
    public void useAbility() {
        System.out.println("Rogue is using a stealth ability.");
    }
}

class CharacterTesting {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Rogue rogue = new Rogue();

        warrior.move();
        warrior.attack();
        warrior.useAbility();

        mage.move();
        mage.attack();
        mage.useAbility();

        rogue.move();
        rogue.attack();
        rogue.useAbility();
    }
}
