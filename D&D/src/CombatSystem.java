import java.util.Random;

public class CombatSystem {
    static Random random = new Random();

    public static void battle(Character player, Companion companion, Monster monster) {
        System.out.println("Battle Start!");

        while (player.health > 0 && monster.health > 0) {
            playerTurn(player, monster);
            if (monster.health <= 0) {
                break;
            }

            monsterTurn(player, monster);
        }

        if (player.health > 0) {
            System.out.println("You defeated the monster!");
            player.gainExperience(20);
            player.displayStats();
        } else {
            System.out.println("You were defeated by the monster!");
        }
    }

    private static void playerTurn(Character player, Monster monster) {
        System.out.println("Your turn!");

        int damage = calculateDamage(player.attack, monster.defense);
        monster.health -= damage;

        System.out.println("You dealt " + damage + " damage to the " + monster.name);
        System.out.println("Monster's health: " + monster.health);
    }

    private static void monsterTurn(Character player, Monster monster) {
        System.out.println("Monster's turn!");

        int damage = calculateDamage(monster.attack, player.defense);
        player.health -= damage;

        System.out.println("The " + monster.name + " dealt " + damage + " damage to you");
        System.out.println("Your health: " + player.health);
    }

    private static int calculateDamage(int attackerAttack, int defenderDefense) {
        int damage = attackerAttack - defenderDefense;
        return Math.max(0, damage);
    }
}