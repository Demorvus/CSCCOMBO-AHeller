import java.util.HashMap;
import java.util.Map;

public class ScabbleTiles {

    public static void main(String[] args) {
        String tiles = "quijibo";
        String word = "jib";

        if (canSpell(tiles, word)) {
            System.out.println("Yes, you can spell the word!");
        } else {
            System.out.println("No, you can't spell the word.");
        }
    }

    public static boolean canSpell(String tiles, String word) {
        Map<Character, Integer> tileCounts = new HashMap<>();

        for (char tile : tiles.toCharArray()) {
            tileCounts.put(tile, tileCounts.getOrDefault(tile, 0) + 1);
        }

        for (char letter : word.toCharArray()) {
            if (tileCounts.containsKey(letter) && tileCounts.get(letter) > 0) {
                tileCounts.put(letter, tileCounts.get(letter) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
