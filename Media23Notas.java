
/** @author Héctor De Castro Sendra
Calcule la media de 23 notas introducidas de forma aleatoria (enteros del 0 al 10). Ha de visualizar las 23 notas y la media final. */

public class Media23Notas {
	public static void main(String args[]){
	int notas[] = new int[23];
	int sum=0, x, media;
		for(x=0;x<23;x++)
		{		
		notas[x]=(int)(Math.random()*11);
		System.out.println("Nota "+x+" es: "+notas[x]);
		sum=sum+notas[x];
		}
		media=sum/23;
	System.out.println("La media es: "+media);
	}
}
