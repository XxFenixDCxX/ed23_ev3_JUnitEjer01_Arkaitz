package cadena;

public class Cadena {
	public Cadena() {}
	public int longitud(String cadena) {
		return cadena.length();
	}
	public int vocales(String cadena) {
		String vocales = "aeiou";
		int contVocales = 0;
		for (int i=0; i<cadena.length();i++) {
			for(int y=0;y<vocales.length();y++) {
				if(vocales.charAt(y) == cadena.charAt(i)) {
					contVocales +=1;
				}
			}
		}
		return contVocales;
	}
	public String invertir(String cadena) {
		String cadenaReverso = "";
		for(int i=cadena.length()-1; i>=0; i--) {
			cadenaReverso += cadena.charAt(i);
		}
		return cadenaReverso;
	}
	public int contarLetra(String cadena, char caracter) {
		int contLetras = 0;
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) == caracter) {
				contLetras+=1;
			}
		}
		return contLetras;
	}
}
