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
public class Pessoa {
    protected String nome;
    protected String rg;

    public Pessoa(){
    
    
    }
   
    
    
        public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Pessoa(int i, String maria, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa(int i, String maria, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa(int i, String rita, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa(int i, String jaqueline, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 public String Mostrar(){


     return("Nome:" + nome + "\n" + "RG:" + rg);
}

public void print(String caption){

    System.out.println(caption + Mostrar());
}




    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }



}
