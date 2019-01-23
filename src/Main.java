import java.util.Scanner; 

public class Main {
	Tray[] trays;
	int currentId = 1;
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.setup(sc);
		main.mainMenu(sc);		
	}
	
	public void setup(Scanner sc) {
		System.out.println("Enter number of trays: ");
		int trayNumber = sc.nextInt();
		System.out.println("Enter the starting larvae count: ");
		int wormNumber = sc.nextInt();
		trays = new Tray[trayNumber];
		for(int i=0; i<trayNumber;i++) {
			trays[i] = new Tray();
			for(int j = 0; j<wormNumber;j++) {
				trays[i].addWorm(new Larvae(currentId));
				currentId++;
			}
		}
		System.out.println(" trays: " + trays.length);
		System.out.println(" worms " + trays[0].getWorms().size());
	}
	
	public void mainMenu(Scanner sc) {
		System.out.println("Main menu:\n Trays: " + trays.length 
				+ "\n1) View Tray\n2) Pass Time");
	
		int option = sc.nextInt();
		switch(option){
			case 1:
				System.out.println("Enter tray number: ");
				int select = sc.nextInt();
				this.trayMenu(sc,trays[select]);
				break;
			case 2:
				System.out.println("enter time (days): ");
				int select2 = sc.nextInt();
				this.passTime(sc, select2);
				break;
			default:
				System.out.println("error, enter valid option");
				break;
		
		}
		this.mainMenu(sc);	
	}
	
	public void trayMenu(Scanner sc,Tray tray_option) {
		System.out.println("Tray Menu:\n" +
				"Current larvae: " + tray_option.getWorms().size() +
				"\n1) Main Menu\n2) Pass Time\n3) View Mealworms");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			this.mainMenu(sc);
			break;
		case 2:
			System.out.println("enter time (days): ");
			int select = sc.nextInt();
			this.passTime(sc, select);
			
			break;
		case 3:
			for (Mealworm worm : tray_option.getWorms()) {
				mealwormInfo(worm);
			}
			break;
		default:
			System.out.println("invalid option");
			break;
		}
		this.trayMenu(sc,tray_option);
	}
	
	public void passTime(Scanner sc, int time) {
		for(int i=0; i<trays.length;i++) {
			trays[i].passTime(time);
		}
	}
	
	public void mealwormInfo(Mealworm worm) {
		System.out.println("\nMealworm ID: " + worm.id + "\n stage:" + worm.stage
				+ "\n age: " + worm.age + "\n weight " + worm.weight);
	}
	
}
