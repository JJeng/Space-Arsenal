package battleCruiser.alpha;

/**
 * Resource class a container for resources to keep track of costs of items and
 * actions and remaining user resources
 * 
 * @author Jeff
 * 
 */
public class Resource {
	volatile int  armor;

	volatile int money;

	volatile int power;

	volatile int shield;

	public Resource(int money, int power, int shield, int armor) {
		this.power = power;
		this.armor = armor;
		this.shield = shield;
		this.money = money;
	}


	public synchronized int getArmor() {
		return armor;
	}


	public synchronized void setArmor(int armor) {
		this.armor = armor;
	}


	public synchronized int getMoney() {
		return money;
	}


	public synchronized void setMoney(int money) {
		this.money = money;
	}


	public synchronized int getPower() {
		return power;
	}


	public synchronized void setPower(int power) {
		this.power = power;
	}


	public synchronized int getShield() {
		return shield;
	}


	public synchronized void setShield(int shield) {
		this.shield = shield;
	}


	public synchronized void subtract(Resource cost){
		this.setArmor(this.getArmor() - cost.getArmor());
		this.setMoney(this.getMoney() - cost.getMoney());
		this.setArmor(this.getPower() - cost.getPower());
		this.setArmor(this.getShield() - cost.getShield());
	}
}
