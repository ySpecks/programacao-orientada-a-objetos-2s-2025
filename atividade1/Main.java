package atividade1;

public class Main{
    public static void main(String[] args){
        Computador computador=new Computador(16,500,4,2.5f);
        SistemaOperacional sistema=new SistemaOperacional(computador);

        Programa programa1=new Programa(8,100,2,500); 
        Programa programa2=new Programa(20,100,2,500); 
        Programa programa3=new Programa(8,600,2,500); 

        sistema.executarPrograma(programa1); 
        sistema.executarPrograma(programa2); 
        sistema.executarPrograma(programa3); 
    }
}