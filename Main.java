
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carte carte1 = new Carte("20");
		Carte carte2 = new Carte("15");
		Carte carte3 = new Carte("15");
		
		
		
		System.out.println("Carte1 si Carte2 sunt identice? " + carte1.esteIdentica(carte2));
		System.out.println("Carte1 si Carte3 sunt identice?"  + carte1.esteIdentica(carte3));
		
	}

}
