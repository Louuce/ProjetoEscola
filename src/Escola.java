/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author paulo
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Funcionario f1= new Funcionario("Fernanda", "15435354", 8 , 72);
        f1.print("Funcionario 1" + "\n");
        
        
        Professor p1= new Professor("Junior", "1231321", 9, 40, "Humanas");
        p1.print("Professor 1:" + "\n");
       
        

        Aluno a1= new Aluno(" Juvenal Juvencio", "13213123", 144525325, "Diurno");
        a1.print("Aluno" + "\n");
     
        
        Aluno a2= new Aluno(" Lucas Braga", "6789734589", 7563534, "Noturno");
        a2.print("\n" + "Aluno" + "\n");
        a2.trancar();
        a2.destrancar();
        a2.desistir();
        a2.formar();
    
        Aluno a3= new Aluno("Junior Ferreira", "87646546", 435346634, "Noturno");
        a3.print("\n" + "Aluno" + "\n");
        a3.trancar();
        a3.destrancar();
        a3.formar();
        a3.desistir();
    }
    
    
}
