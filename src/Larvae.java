
public class Larvae extends Mealworm{
	int transTime = 15;
	
	public Larvae(int id) {
		super(0,id,"Larvae");
	}
	
	public Mealworm passTime(int time_to_pass) {
		this.updateAge(time_to_pass);
		this.updateWeight();
		return this.transform();
	}
	
	public void updateWeight() {
		weight = age*3;
	}
	
	public Mealworm transform() {
		if(this.age>=this.transTime) {
			Adult newWorm = new Adult(this.id,this.age, "Adult");
			return newWorm;
		}
		else {
			return this;
		}
	
	}
	
	

}
