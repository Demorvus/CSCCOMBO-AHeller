import java.util.HashMap;

public class ScrabbleGame {

    public static void main(String[] args) {

        String tiles = "quijibo";
        String word = "jib";
        boolean result = canSpell(tiles, word);
        System.out.println("Can spell '" + word + "' with the tiles: " + result);
    }

    public static boolean canSpell(String tiles, String word) {
        HashMap<Character, Integer> tileFrequency = new HashMap<>();
        for (char tile : tiles.toCharArray()) {
            tileFrequency.put(tile, tileFrequency.getOrDefault(tile, 0) + 1);
        }

        for (char letter : word.toCharArray()) {
            if (tileFrequency.containsKey(letter) && tileFrequency.get(letter) > 0) {

                tileFrequency.put(letter, tileFrequency.get(letter) - 1);
            } else {

                return false;
            }
        }


        return true;
    }
}
