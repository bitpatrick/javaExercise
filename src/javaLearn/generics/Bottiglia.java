package javaLearn.generics;

//classe Generic

public class Bottiglia<T extends Bevanda> { // il parametro T può essere visto come un segna posto , i segnaposto per convenzione sono T,E,V e K
	// extends Bevanda : è quello che viene considerato LIMITE SUPERIORE per il parametro Tipo
	// extends non indica che la classe che sostituisce il parametro T debba necessariamente 
	// implementare Bevanda , m che deve essere un tipo compatibile con il tipo Bevanda
	
	
	private T contenuto;

	public Bottiglia(T t) {
	
		this.contenuto = t;
	}

	public T getContenuto() {
		return contenuto;
	}

	
	
}
