package arrays;
import java.util.*;
public class exercicio2 {
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
	� Os n�meros pares digitados;
	� A soma dos n�meros pares digitados;
	� Os n�meros �mpares digitados;
	� A quantidade de n�meros �mpares digitados.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [6];
		int i, soma=0,qtdd=0;
		for(i=0;i<6;i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if(a[i]%2==0) {
				System.out.println("a["+(i+1)+"] � par: "+a[i]);
				soma+=a[i];
			}else {
				qtdd+=1;
				System.out.println("a["+(i+1)+"] � �mpar: "+a[i]);
			}			
		}
		System.out.println("Qtdd de impares: "+qtdd+"\nSoma dos n� pares: "+soma);
	}

}
