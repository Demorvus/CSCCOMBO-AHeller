class Monster {
    String name;
    int health;
    int attack;
    int defense;

    Monster(String name) {
        this.name = name;
        this.health = 20;
        this.attack = 6;
        this.defense = 2;
    }

    void displayStats() {
        System.out.println("Monster: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
    }
}
