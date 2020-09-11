package arrays;
import java.util.*;
public class exercicio2 {
	/*2- Faça um programa que receba 6 números inteiros e mostre:
	• Os números pares digitados;
	• A soma dos números pares digitados;
	• Os números ímpares digitados;
	• A quantidade de números ímpares digitados.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [6];
		int i, soma=0,qtdd=0;
		for(i=0;i<6;i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if(a[i]%2==0) {
				System.out.println("a["+(i+1)+"] é par: "+a[i]);
				soma+=a[i];
			}else {
				qtdd+=1;
				System.out.println("a["+(i+1)+"] é ímpar: "+a[i]);
			}			
		}
		System.out.println("Qtdd de impares: "+qtdd+"\nSoma dos nº pares: "+soma);
	}

}
