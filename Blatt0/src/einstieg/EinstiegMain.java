package einstieg;

import hso.*;

public class EinstiegMain {
	
	//Einstiegsübungen mit Ausgaben in der Konsole//
	public static void main(String[] args) {
		/*JSimple.check(selfMultiplicator(3), 9);
	    JSimple.check(selfMultiplicator(5), 25);
	    JSimple.check(selfMultiplicator(0), 0);*/
	    
	    String Test1 = "Wort1 ";
	    String Test2 = "Wort2";
	    String Test3 = "Wort3";
	    int zahl=5;
	    int zahl2=6;
	    String Test4 = "Die Variable hat den Wert: ";
	    System.out.println(Test1);//println schreibt in eine Zeile 
	    System.out.println(Test2);//print schreibt eine Zeile weiter unten rein
	    System.out.print(Test4 + zahl+", ");
	    System.out.println(" Die andere Variable hat den Wert "+zahl2);
	    
	}
	/*static int selfMultiplicator(int input) {
		return input*input;
		
	}*/
	

}
