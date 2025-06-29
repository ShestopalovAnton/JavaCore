
public class MagnitikiCode_DrumKitTestDriver {
	public static void main (String[] args) {
		System.out.print("Привет мир, Java!\n\n");
		
		DrumKit d = new DrumKit();
		
		d.playSnare();
		d.snare = false;
		d.playTopHat();
		
		if (d.snare == true) {
			d.playSnare();
		}
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'main' of https://github.com/ShestopalovAnton/JavaCore.git
