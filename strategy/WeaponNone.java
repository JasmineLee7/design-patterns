package strategy;

public class WeaponNone implements WeaponBehavior {

	public void attack() {
		System.out.println("I am too peacful to attack!");
	}
}
