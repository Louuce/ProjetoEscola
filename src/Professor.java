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
public class Professor extends Funcionario{
    protected String aa;
    
    
    
   public Professor(){  
       super();
    }
    
    public Professor( String nome, String rg, float sh, float hm, String aa){
    super(nome ,rg, sh, hm);
    this.aa=aa;
    }
    
    @Override
    public String Mostrar(){
        return super.Mostrar()+ "Sua area de atuação eh: " + aa + " \n ";
    
    
    
        
    
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }
    
    
    
}

