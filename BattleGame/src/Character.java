import java.util.Random;

public class Character {
	private String name;
	private int strength;
	private double health;
	private int speed;
	private Weapon weapon;
	private Random rand = new Random();


	public Character(String name, int strength, double health, int speed, Weapon weapon) {
		super();
		this.name = name;
		this.strength = strength;
		this.health = health;
		this.speed = speed;
		this.weapon = weapon;
		this.rand = rand;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

// ****** Methods *******

	public double doDamage() {
		double randomNum = rand.nextDouble();
		double damage = randomNum * strength * weapon.getDamageFactor();
		return damage;
	}
	public void recordDamage(double damage) {
		health = health - damage;
		if (health < 0) {
			health = 0;
		}
	}

	public boolean isDead() {
		return health <= 0;
	}

	@Override
	public String toString() {
		return "Charachter [name=" + name + ", strength=" + strength + ", health=" + health + ", speed=" + speed
				+ ", weapon=" + weapon + "]";
	}

}
