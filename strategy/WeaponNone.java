package strategy;
// Jasmine Lee - Aug 2025

public class WeaponNone implements WeaponBehavior {

	public void attack() {
		System.out.println("I am too peacful to attack!"); // no weapon, no attack
        Resources.sleep(2000); // just enough for a good pause
	}
}
