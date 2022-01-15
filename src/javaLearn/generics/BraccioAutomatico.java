package javaLearn.generics;

public class BraccioAutomatico {
	
	
	/*
	 * ? : carattere jolly : i ngrado di ricevere in input  bottiglie con diversi tipi di contenuto
	 * i jolly possono essere limitati sia sup che inf .
	 * limitazione inf: <? super sottoclasse>
	 * 
	 */
	
	private Bottiglia<? extends Bevanda> bottiglia;
	
	public <T extends Bottiglia<? extends Bevanda>> BraccioAutomatico(T bottiglia) {
		
		this.bottiglia = bottiglia;
		System.out.println(this.bottiglia.getContenuto());
		
	}
	
	public BraccioAutomatico() {}
	
	
	// ? extends Bevanda: limito superioremente, in modo tale da evitare il passaggio di tipi che non hanno significato
	
	public void prendiBottiglia(Bottiglia<? extends Bevanda> bottiglia) { // ? indica bottiglia generica
		
		System.out.println("ho preso " + bottiglia.getContenuto());
	}
	
	/*
	 * la suddetta classe modella il comportamento del braccio che è in grado
	 * di afferrare una bottiglia senza preoccuparsi del suo contenuto
	 * 
	 */
	
	public void versaBevanda() {
		if ( bottiglia != null )
			System.out.println("Versa"+bottiglia.getContenuto().toString());
		else
			System.out.println("Bottiglia vuota");
	}

}
