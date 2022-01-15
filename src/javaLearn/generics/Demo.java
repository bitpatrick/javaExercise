package javaLearn.generics;

public class Demo {

	public static void main(String[] args) {

		Bottiglia<Acqua> bottiglia1 = new Bottiglia<Acqua>( new Acqua());
		Bottiglia<Vino> bottiglia2 = new Bottiglia<Vino>(new Vino());
		
		BraccioAutomatico braccio = new BraccioAutomatico(bottiglia1);
		//braccio.prendiBottiglia();
		braccio.versaBevanda();
		braccio.prendiBottiglia(bottiglia2);
		braccio.versaBevanda();

		
		/*
		 * la classe BraccioAutomatico eseguirà quindi la stessa azione
		 * per due tipi di bottiglie differenti.
		 * Non siamo poi limitati all'uso di un solo parametro, possiamo infatti
		 * definire classi generiche con piu parametri:
		 * 
		 * public class GenericClass<T,E,K> {...}
		 * 
		 * 
		 * 
		 */
		
		//Bottiglia<String> b = new Bottiglia<String>(new String());
		
		
		
	}

}
