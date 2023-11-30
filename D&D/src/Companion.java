class Companion {
    String name;
    int health;
    int attack;
    int defense;

    Companion(String name) {
        this.name = name;
        this.health = 50;
        this.attack = 8;
        this.defense = 4;
    }

    void displayStats() {
        System.out.println("Companion: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
    }
}
