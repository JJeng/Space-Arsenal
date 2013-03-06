package battleCruiser.alpha;

public class Player {
	Resource playerResource;
	public Player(){
		//new set of resources
		playerResource = new Resource(10000,100,100,100);
	}
	public boolean resourcesAvailable(Resource cost) {
		return (playerResource.getArmor() >= cost.getArmor() &&
				playerResource.getMoney() >= cost.getMoney() &&
				playerResource.getPower() >= cost.getPower() &&
				playerResource.getShield() >= cost.getShield());
	}
	public void useResource(Resource cost) {
		playerResource.subtract(cost);
	}
}
