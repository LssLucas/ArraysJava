package arrays;

public class exercicio1 {
	/*
	 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
	inteiros. O programa deve executar os seguintes passos:
	(a)	 Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
	A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
	(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
	(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  {1,0,5,-2,-5,7};
		int i,soma=0;
		for(i=0;i<6;i++) {
			if(i==0 || i==1 || i==5) {
				soma+=a[i];//solu��o (a)
			}
			if(i==3) {
				a[i]=100;//solu��o (b)
			}
			System.out.println("a["+(i+1)+"] = "+a[i]+"\n");//solu��o (d)
		}
		System.out.println("Soma das posi��es a[0]  a[1]  a[5] = "+soma+"");//solu��o (c)
	}

}
