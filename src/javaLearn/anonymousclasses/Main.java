package javaLearn.anonymousclasses;

public class Main {

	public static void main(String[] args) {

/*
 * a seconda che la classe anonima estenda una classe o implementi 
 * un'interfaccia si possono avere due varianti:
 * 
 * new ClassName( [argument-list]) { class-body }
 * 
 * oppure:
 * 
 * new InterfaceName () { class-body }
 * 
 * 
 * 
 */
		
		//
		Animal specialAnimal = new Animal(true) {
			
			private String descrizione;
			
			public String descrizioneAnimale() {
				return descrizione;
			}
		};
		
		
		//istanziare oggetto a partire da una classe anonima che estende un 'interfaccia
		Object englishTitle= new TitledName() {
			@Override
			public String femaleTitle(String name) {
				return "Ms "+name;
			}
			@Override
			public String maleTitle(String name) {
				return "Mister "+name;
			}
		};

	}

}
