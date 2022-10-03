package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int [] a : matrise) {
		for (int b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
			
		
		}
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tabell = "";
		for (int [] a : matrise) {
		for (int b : a) {
		 tabell += b;
		tabell += " ";
		}
		tabell += "\n";
		}
		return tabell;
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
	}

	// c)
	
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				matrise[i][j] *= tall;
			}
		}
		return matrise;
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean sjekk = true;
		if (a.length == b.length) {
			for(int i = 0; i<a.length; i++) {
				if (!(a[i].length == b[i].length)) {
					return false;
				}
			}
		} else { 
				return false;
		}
		 for (int n = 0; n<a.length; n++) {
			 for (int m = 0; m<a[n].length; m++) {
				 if (!(a[n][m] == b [n][m])) {
					 sjekk = false;
				 }
			 }
		 }
		 	if (sjekk) {
		 			return true;
		 	} else {
		 			return false; 
		 			}
	}
	}
		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
	
	// e)
	//public static int[][] speile(int[][] matrise) {

		// TODO
	//	throw new UnsupportedOperationException("speile ikke implementert");
	
	//}

	// f)
//	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
//		throw new UnsupportedOperationException("multipliser ikke implementert");
	
