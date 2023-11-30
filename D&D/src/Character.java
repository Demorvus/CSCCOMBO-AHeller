import java.util.Scanner;

class Character {
    String name;
    String race;
    int level;
    int experience;
    int health;
    int maxHealth;
    int attack;
    int defense;

    Character(String name, String race) {
        this.name = name;
        this.race = race;
        this.level = 1;
        this.experience = 0;
        this.maxHealth = 100;
        this.health = this.maxHealth;
        this.attack = 10;
        this.defense = 5;
    }

    void levelUp() {
        this.level++;
        this.maxHealth += 10;
        this.health = this.maxHealth;
        this.attack += 5;
        this.defense += 3;
    }

    void gainExperience(int exp) {
        this.experience += exp;
        if (this.experience >= 100) {
            levelUp();
            this.experience -= 100;
        }
    }

    void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + experience);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
    }
}
