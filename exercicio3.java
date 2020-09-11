package arrays;

public class exercicio3 {
	/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = new int [3][3];
		int i,j,cont=0;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				m[i][j] = (int) Math.round(Math.random() * 20)+1;
				if(m[i][j]>10) {
					cont+=1;
					System.out.println("m["+i+"]["+j+"] = "+m[i][j]);
				}
			};
		};
		System.out.println("Qtdd de nº >10 = "+cont);
	}

}
