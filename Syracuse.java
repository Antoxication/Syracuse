import java.util.Arrays;

public class Syracuse {
	private static int[] tableauInt = new int[871];
	private static String[] tableauString = new String[871];
	private static int tempsDeVol;
	private static int volMax = 0;
	private static int nombreMaxVol;
	private static int maxAltitude = 0;
	private static int nombremMaxAltitude;
	private static int nombre;
	private static int syracuse(int nombre) {
		return nombre % 2 == 0 ? nombre / 2 : 3 * nombre + 1;
	}
	private static void syracuseReverse() {
		boolean tableau3[] = new boolean[1000];
		int nombre = 1;
		do {
			do {
				nombre =- 6;
			} while (nombre >= 5);
		} while (nombre >= 5);
	}
	/**
	 * 
	 * @return
	 * @Override
	 */
	public String toString() {
		for (int i = 0 ; i < ("" + nombre).length() ; i ++) {
			
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		for (int i = 0 ; i < 871 ; i++) {
			tableauInt[i] = i + 1;
		}
		System.out.println(Arrays.toString(tableauInt));
		for (int valeur : tableauInt) {
			nombre = valeur;
			tempsDeVol = 0;
			do {
				System.out.println(valeur);
				tempsDeVol++;
				if (valeur > maxAltitude) {
					maxAltitude = valeur;
					nombremMaxAltitude = nombre;
				}
				valeur = syracuse(valeur);
			} while (valeur != 4 && valeur != 2 && valeur != 1);
			if (tempsDeVol > volMax) {
				volMax = tempsDeVol;
				nombreMaxVol = nombre;
			}
			tableauString[nombre - 1] = + nombre + " OK";
			System.out.println(Arrays.toString(tableauString));
			System.out.println("TEMPS DE VOL " + tempsDeVol);

		}
		System.out.println("le temps de vol le plus grand est " + volMax + " pour le nombre " + nombreMaxVol);
		System.out.println("l'altitude maximale est de " + maxAltitude + ", atteinte pour le nombre " + nombremMaxAltitude);
	}
}
//if (syracuse(nombre) == 4 || syracuse(nombre) == 2 || syracuse(nombre) == 1) {
//	for (int i = 1 ; i <= 100 ; i++){
//		nombre = syracuse(nombre);
//		System.out.println(nombre);
//		if (!(syracuse(nombre) <= 4)) {
//			System.out.println("la suite dépasse 4 après avoir atteint la valeur 4");
//		}
	//}
//	tableauString[nombre] = "cycle trivial pour " + nombre;
//} "on obtient un cycle trivial en faisant passer " + + " dans la suite de Syracuse"
