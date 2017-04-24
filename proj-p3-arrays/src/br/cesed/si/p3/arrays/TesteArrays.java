package br.cesed.si.p3.arrays;

public class TesteArrays {

	public static void main(String[] args) {

		// time 2
		
		//tanto faz um quanto o outro
		int[] meuArrayInt = new int[] {1,2,4,5,9}; //aqui não podemos colocar o tamanho

		int[] meuArrayInt2 = new int[5];
		meuArrayInt2[0] = 1;
		meuArrayInt2[1] = 2;
		meuArrayInt2[2] = 4;
		meuArrayInt2[3] = 5;
		meuArrayInt2[4] = new Integer(9);
		
		int[] meuArrayProlongado = new int[meuArrayInt2.length * 2];
		
		for (int i = 0; i < meuArrayInt2.length; i++) {
			meuArrayProlongado[i] = meuArrayInt2[i];	
		}
		
		meuArrayInt2 = meuArrayProlongado; //liberar o array anterior
		
		// time 1
		
		int[] meuArray = new int[3];
		
		for (int i : meuArray) {
			System.out.println(i);
		}
		
		Conta[] meuArrayContas = new Conta[3];
		meuArrayContas[0] = new Conta(1,1);
		meuArrayContas[1] = new Conta(1,2);
		meuArrayContas[2] = new Conta(1,3);
		//meuArrayContas[3] = new Conta(1,4); ArrayIndexOutOfBoundsException

		for (Conta conta : meuArrayContas) {
			System.out.println(conta);
		}
	}
}
