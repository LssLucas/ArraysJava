package arrays;
import java.util.Scanner;
public class exercicio4 {
	/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
	menu de opções:
	(1) somar as duas matrizes
	(2) subtrair a primeira matriz da segunda
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
	da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
	própria matriz.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m[][]=new float [2][2];
		float n[][]=new float [2][2];
		int opcao, i, j, repetir;
		Scanner read = new Scanner (System.in);
		do {
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					m[i][j] = (float) Math.round(Math.random() * 20)+1;
					n[i][j] = (float) Math.round(Math.random() * 20)+1;
				}
			}
			System.out.println("(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
			opcao = read.nextInt();
			while(opcao<1 || opcao>4) {
				System.out.println("(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
				opcao = read.nextInt();			
			}
			switch (opcao) {
			case 1:
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						float o[][] = new float[2][2];
						o[i][j]=m[i][j]+n[i][j];
						System.out.print("["+o[i][j]+"] ");
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						float o[][] = new float[2][2];
						o[i][j]=m[i][j]-n[i][j];
						System.out.print("["+o[i][j]+"] ");
					}
				}
				break;
			case 3:
				int K;
				System.out.println("digite uma constante p somar as matrizes:");
				K = read.nextInt();
				System.out.print("Matriz M");
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						m[i][j]+=K;
						System.out.print("["+m[i][j]+"] ");					
					}
				}
				System.out.print("\nMatriz N");
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						n[i][j]+=K;
						System.out.print("["+n[i][j]+"] ");					
					}
				}			
				break;
			case 4:
				System.out.println("Matriz M");
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						System.out.print("["+m[i][j]+"] ");
					}
				}
				System.out.println("\n\nMatriz N");
				for(i=0;i<2;i++) {
					System.out.print("\n");
					for(j=0;j<2;j++) {
						if(i<10 && j<10) {
							System.out.print("[0"+n[i][j]+"] ");
						}
					}
				}
				break;
			}			
			System.out.println("\nRepetir?\n1 - sim\n2 - não");
			repetir = read.nextInt();
		}while(repetir==1);
	}
}
