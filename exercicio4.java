package arrays;
import java.util.Scanner;
public class exercicio4 {
	/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
	menu de op��es:
	(1) somar as duas matrizes
	(2) subtrair a primeira matriz da segunda
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes
	Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
	da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
	pr�pria matriz.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m[][]=new float [2][2];
		float n[][]=new float [2][2];
		int opcao, i, j;
		Scanner read = new Scanner (System.in);
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
			System.out.print("Matriz M");
			for(i=0;i<2;i++) {
				System.out.print("\n");
				for(j=0;j<2;j++) {
					m[0][0]=13;
					System.out.print("["+m[i][j]+"] ");					
				}
			}
			System.out.print("\nMatriz M");
			for(i=0;i<2;i++) {
				System.out.print("\n");
				for(j=0;j<2;j++) {
					n[0][0]=13;
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
		}
	}
