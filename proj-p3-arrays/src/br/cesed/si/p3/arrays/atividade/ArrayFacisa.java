package br.cesed.si.p3.arrays.atividade;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author aluno
 *
 */
public class ArrayFacisa {
	
	private int posicao;
	private int tamanho;
	private Object[] arrayFacisa;
	private Object[] arrayFacisaProlongado;

	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayFacisa(int tamanho) {
		this.tamanho = tamanho;
		this.arrayFacisa = new Object[this.tamanho];
	}
	
	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		return posicao;
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		
		if(posicao >= arrayFacisa.length) {
			arrayFacisaProlongado = new Object[arrayFacisa.length * 2];
		
			for (int i = 0; i < arrayFacisa.length; i++) {
				arrayFacisaProlongado[i] = arrayFacisa[i];
			}
			arrayFacisa = arrayFacisaProlongado;
		}
		arrayFacisa[posicao++] = obj;
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		
		int posicaoElementoPraRemover = -1;

		//código pra identificar em que posição o objeto a ser removido está
		for (int i = 0; i < arrayFacisa.length; i++) {
			
			if(arrayFacisa[i] != null && arrayFacisa[i].equals(obj)) {
				posicaoElementoPraRemover = i;
				break;
			}
		}for(int i = posicaoElementoPraRemover; i < posicao; i++) {
			arrayFacisa[i] = arrayFacisa[i+1];
		}
		posicao--;
	}
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 */
	public Object getByIndex(int index) {	
		
		return arrayFacisa[index];
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {
		
		int posicaoObj = 0;
		
		for (int i = 0; i < arrayFacisaProlongado.length; i++) {
			
			if(arrayFacisaProlongado[i].equals(obj)) {
				posicaoObj = i;
				break;
			}
		}
		return posicaoObj;
	}
	
	public void printAllElements() {
		
		for(int i = 0; i < posicao; i++) {
			System.out.println(arrayFacisa[i]);
		}
	}
}
