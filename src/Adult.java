
public class Adult extends Mealworm {
	int transTime = 15;
	
	public Adult(int id,int age, String stage) {
		super(age,id,stage);
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
