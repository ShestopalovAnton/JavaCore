public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.print("Я загадываю число от 0 до 9...\n");
		
		while (true) {
			System.out.print("Число, которое нужно угадать, - " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.print("\nПервый игрок думает, что это " + guessp1);
			guessp2 = p2.number;
			System.out.print("\nВторой игрок думает, что это " + guessp2);
			guessp3 = p3.number;
			System.out.print("\nТретий игрок думает, что это " + guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.print("\nУ нас есть победитель!");
				System.out.print("\nПервый игрок угадал? " + p1isRight);
				System.out.print("\nВторой игрок угадал? " + p2isRight);
				System.out.print("\nТретий игрок угадал? " + p3isRight);
				System.out.print("\nКонецц игры!");
				break;
			} else {
				System.out.print("\nИгроки должны попробовать еще раз.");
			}
		}
	}
}