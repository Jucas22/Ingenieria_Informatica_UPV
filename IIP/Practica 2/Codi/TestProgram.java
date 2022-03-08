package pract2;

/**
 * Classe programa per a provar totes les figures definides.
 * També es pot fer una execució pareguda utilitzant
 * el <B>workbench</B> del BlueJ.
 * @author IIP 
 * @version Pràctica 2 - Curs 2021/22
 */
public class TestProgram {
    /** No hi ha objectes d'aquesta classe */
    private TestProgram() { }

    public static void main(String[] args) {         
        // Inicialitzar el lloc de dibuix, donant-li
        // un nom i dimensions:
        Blackboard meuaPissarra = new Blackboard("UNA FINESTRA AL MON", 500, 300);
                
        // Inicialitzar un cercle groc:
        Circle c = new Circle(50, "yellow", 100, 100);   
        // ficar-lo a l'espai de dibuix:
        meuaPissarra.add(c);
        // mostrar per pantalla el perímetre del cercle:
        System.out.println("El perímetre del cercle és " + c /* COMPLETAR */);
        
        // Inicialitzar un rectangle llarg i roig:
        Rectangle r = new Rectangle(100, 10, "red", 50, 155);
        // ficar-lo a l'espai de dibuix:
        meuaPissarra.add(r);  
        
        // Inicialitzar un triangle isòsceles negre:
        TrIsosceles t = new TrIsosceles(30, 60, "black", 210, 60 );
        // ficar-lo a l'espai de dibuix:
          meuaPissarra.add(t);          
    }
    
} // de TestProgram

