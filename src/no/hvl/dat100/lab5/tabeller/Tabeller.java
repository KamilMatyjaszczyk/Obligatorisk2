package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("Tabell : [ ");
		for (int i =0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");
			
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String itabell = "[";
	    for(int i = 0; i<tabell.length; i++) {
	      if(i == tabell.length-1){
	        itabell+= tabell[i] + "]";
	      }else{
	        itabell+= tabell[i] + ",";
	      }
	    }
	    return itabell;  
	    
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum=0;
		for(int i =0; i<tabell.length;i++) {
			sum+=tabell[i];
		}
		return sum;
		
		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet= false;
		int pos= 0;
		while(!funnet&& pos< tabell.length) {
			if(tall== tabell[pos]) {
				funnet= true;
				}
			pos++;
			}
		return funnet;
		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		boolean funnetTall=false;
		int i=0;
		do {
			if(tabell[i]==tall) {
				funnetTall=true;
			}
			i++;
		}while(i<tabell.length&&funnetTall==false);
		if(funnetTall==false) {
			i=-1;
		}
	return i;
	
		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tab = new int[tabell.length];
		int fraTop= tabell.length-1;
		for (int i=0; i<tabell.length; i++) {
			tab [i]= tabell[fraTop];
			fraTop--;
		}
		 return tab;
		
		// TODO
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int j= 0;
		boolean sortert= true;
		while(sortert && j< tabell.length-1) {
			if(tabell[j] > tabell[j+1]) {
				sortert= false;
				}
			j++;
			}
		return sortert;
		
		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i=0; i<tabell1.length; i++) {
			nyTab[i]= tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length +j] = tabell2[j];
		}
			 
		return nyTab;
		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
