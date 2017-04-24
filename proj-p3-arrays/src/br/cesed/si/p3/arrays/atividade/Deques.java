package br.cesed.si.p3.arrays.atividade;

public class Deques {
	
	private int posicao;
	private int tamanho;
	private Object[] dequeFacisa;
	private Object[] dequeFacisaProlongado;
	
	
	public Deques(int tamanho) {
		this.tamanho = tamanho;
		this.dequeFacisa = new Object[this.tamanho];
	}

	public int size() {
		return posicao;
		
	}
	
	public void addInicio(Object obj){
		
		if(posicao == dequeFacisa.length){
			dequeFacisaProlongado = new Object[dequeFacisa.length * 2];
			
			for (int i = 0; i < dequeFacisa.length; i++) {
				dequeFacisaProlongado[i] = dequeFacisa[i];
			}
			dequeFacisa = dequeFacisaProlongado;
		}
		
		
		if(dequeFacisa[0] != null){
			
			for (int i = posicao; i < dequeFacisa.length; i++) {
				dequeFacisaProlongado[i+1] = dequeFacisa[i];
			}
			dequeFacisa = dequeFacisaProlongado;
	
		}
		dequeFacisa[0] = obj;
	}
	
	public void addFim(Object obj){
		
		if(posicao == dequeFacisa.length){
			dequeFacisaProlongado = new Object[dequeFacisa.length * 2];
			
			for (int i = 0; i < dequeFacisa.length; i++) {
				dequeFacisaProlongado[i] = dequeFacisa[i];
			}
			dequeFacisa = dequeFacisaProlongado;
		}
		
		if(dequeFacisa[posicao] == null){
			dequeFacisaProlongado[posicao] = obj;
		}
	}
	
	public void removeIncio(Object obj){
		
		for (int i = 0; i < dequeFacisa.length-1; i++) {
			dequeFacisa[i] = dequeFacisa[i+1];
		}
	}
	
	public void removeFim(){
		
		dequeFacisa[dequeFacisa.length-1] = null;
	}
}
