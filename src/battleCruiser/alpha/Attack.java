package battleCruiser.alpha;

public abstract class Attack {
	MapObject target;
	MapObject attacker;
	int damage;
	Resource costs;
	float range;
	
	public Attack(int damage, Resource costs, float range) {
		this.damage = damage;
		this.costs = costs;
		this.range = range;
	}

	/**
	 * setTarget
	 * step 1:
	 * must call this first to set the attacker and target
	 * logic is done to determine if object is attackable
	 * @return boolean true if successful target set
	 */
	public boolean setTarget(MapObject attacker, MapObject target){
		//TODO: Target Lock algos
		if(target.isAttackable()&&(target.getLocation().distance(attacker.getLocation()))< range){
			this.target = target;
			return true;
		}
		return false;
	}	
	/**
	 * creates a MapObject for visual effects and waits
	 * for a response to see if the attack was successful or not, 
	 * @return
	 */
	public abstract boolean use();
	
}
