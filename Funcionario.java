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
public class Funcionario extends Pessoa{
    protected float sh;
    protected float hm;
    
    public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String rg, float sh, float hm){
    super(nome, rg);
    this.sh=sh;
    this.hm=hm;
    }
    
    
    @Override
     public String Mostrar(){
        return super.Mostrar() + "\n" + "Seu salario hora eh de :" + sh + "\n" +"Suas horas mensais sao: " + hm + "\n";
    }

    public float getSh() {
        return sh;
    }

    public void setSh(float sh) {
        this.sh = sh;
    }

    public float getHm() {
        return hm;
    }

    public void setHm(float hm) {
        this.hm = hm;
    }
     
     
     
     
     
}



