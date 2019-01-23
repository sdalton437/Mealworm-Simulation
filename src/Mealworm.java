
public class Mealworm {
	public int age;
	double protein_percent;
	double weight;
	double length;
	String stage;
	int id;
	
	public Mealworm(int startage, int id, String stage) {
		age = startage;
		this.id = id;
		this.stage = stage;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void updateAge(int time) {
		age = age + time;
	}
	
	public Mealworm passTime(int time_to_pass) {
		this.updateAge(time_to_pass);
		return this;
	}
}
