public class Carte {
	private String numarPagini;
	
	public Carte(String numarPagini) {
		this.numarPagini = numarPagini;	

}


public boolean esteIdentica(Carte altaCarte) {
	return this.numarPagini.equals(altaCarte.numarPagini);
	
}

public String toString() {
	return "Carte cu" + numarPagini + " pagini";
	
}


}
