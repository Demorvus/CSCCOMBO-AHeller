import java.util.Random;

public class Battle {

	static Random random = new Random();

	public static void main(String[] args) {


		Character monster = new Character("Monster", 100, 100.0, 30, null);
		Weapon mWeapon = new Weapon("Claws", 2, 0.4, true);
		monster.setWeapon(mWeapon);

		Character goodGuy = new Character("GoodGuy", 100, 100.0, 30, null);
		Weapon gWeapon = new Weapon("Sword", 5, 0.5, true);
		goodGuy.setWeapon(gWeapon);

		double damage;

		while (!monster.isDead() && !goodGuy.isDead()) {
			double turn = random.nextInt(1, 3);
			if (turn == 1) {
				damage = goodGuy.doDamage();
				monster.recordDamage(damage);
				System.out.println("The good guy did " + damage + " damage to the monster");
			} else {
				damage = monster.doDamage();
				goodGuy.recordDamage(damage);
				System.out.println("The monster did " + damage + " damage to the good guy");
			}
		}


	}
}
