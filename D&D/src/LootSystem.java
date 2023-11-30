import java.util.Random;

class LootSystem {
    static Random random = new Random();

    static String[] lootableItems = {"Sword", "Shield", "Health Potion"};

    static String generateLoot() {
        int index = random.nextInt(lootableItems.length);
        return lootableItems[index];
    }

    static void awardLoot(Character player) {
        String loot = generateLoot();

        System.out.println("You found a " + loot + "!");
        
        if (loot.equals("Sword")) {
            player.attack += 5;
        } else if (loot.equals("Shield")) {
            player.defense += 3;
        } else if (loot.equals("Health Potion")) {
            player.health += 20;
            if (player.health > player.maxHealth) {
                player.health = player.maxHealth;
            }
        }
    }
}