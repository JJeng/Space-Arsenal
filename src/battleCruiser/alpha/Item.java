package battleCruiser.alpha;

public abstract class Item {
	
	public boolean use(Resource cost, Player player){
		if (player.resourcesAvailable(cost)){
			player.useResource(cost);
			return true;
		}
		return false;
	}
}