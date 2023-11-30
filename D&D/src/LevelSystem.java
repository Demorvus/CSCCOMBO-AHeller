class LevelSystem {
    static void gainExperience(Character player, Companion companion, int experience) {
        player.gainExperience(experience);
        companion.gainExperience(experience);

        System.out.println("You and your companion gained " + experience + " experience points.");

        if (player.experience >= 100) {
            player.levelUp();
            System.out.println("Congratulations! You leveled up to level " + player.level + ".");
        }

        if (companion.experience >= 100) {
            companion.levelUp();
            System.out.println("Your companion leveled up to level " + companion.level + ".");
        }
    }
}