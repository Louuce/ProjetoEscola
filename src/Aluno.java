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
public class Aluno extends Pessoa{
    protected int ra;
    protected String turno;
    protected String status;
    
    
 public Aluno(){
super();
 }
 
 public Aluno(String nome, String rg, int ra,  String turno){
     super(nome, rg);
     this.ra=ra;
     this.turno=turno;
     this.status="ativo";
 }
 
 public void trancar(){
     if (status =="ativo"){
         status="matricula trancada";
         System.out.println("A Matricula agora está trancada");
     }
 }
 
public void destrancar(){
    if (status=="matricula trancada"){
        status="ativo";
        System.out.println("A Matricula agora está destrancada");
    }
}


public void formar(){
    if(status=="ativo"){
        status= "egresso";
        System.out.println("Aluno está formado");
    }

}

public void desistir(){
    if(status== "ativo" || status=="matricula trancada"){
    status="desistiu";
    System.out.println("Aluno desistiu do curso");
    }

}

@Override
public String Mostrar(){
    return super.Mostrar() + "\n" + "o R.A do aluno:" + ra + "\n" + "O turno eh:" + turno + "\n" + "Status:" + status;
    
}

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public String getStatus(){
     return status;
    }

}

