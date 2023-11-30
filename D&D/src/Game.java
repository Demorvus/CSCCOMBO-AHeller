public class Game {
    public static void main(String[] args) {
        String playerName = CharacterCreation.createCharacter().name;
        Character player = new Character(playerName, "Human");
        Companion companion = new Companion("Bob");

        System.out.println("Initial Stats:");
        player.displayStats();
        companion.displayStats();

        Monster goblin = new Monster("Goblin");
        goblin.displayStats();

        System.out.println("Battle Start!");
        CombatSystem.battle(player, companion, goblin);

        if (player.health > 0) {
            LootSystem.awardLoot(player);
        }

        int experienceGained = 20;
        LevelSystem.gainExperience(player, companion, experienceGained);

        System.out.println("Final Stats:");
        player.displayStats();
        companion.displayStats();
    }
}