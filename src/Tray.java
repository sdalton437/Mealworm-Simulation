import java.util.ArrayList;

public class Tray {
	ArrayList<Mealworm> worms;
	
	public Tray() {
		worms = new ArrayList<Mealworm>();
	}
	
	public void emptyWorms(){
		worms.clear();
	}
	
	public void addWorm(Mealworm worm) {
		worms.add(worm);
	}
	
	public ArrayList<Mealworm> getWorms() {
		return this.worms;
	}
	public void passTime(int time) {
		for(int i=0;i<worms.size();i++) {
			worms.set(i,worms.get(i).passTime(time));
		}
	}
}
