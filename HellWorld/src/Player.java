
public class Player {
	int number = 0;
	public void guess() {
		 number = (int) (Math.random() * 10);
		 System.out.print("\nДумаю, что число " + number);
	}
}