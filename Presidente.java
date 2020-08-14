package Setores;

public class Presidente extends Funcionario {
    
    public Presidente(){
        super();
    }
    
    public Presidente(String nome, String documento){
        super(nome, documento);
    }
    
   
    @Override
    public void exibeDados(){
        System.out.println("Papel: " + super.verificaFuncao() + "\nNome: " + super.getNome() + 
                           "\nDocumento: " + super.getDocumento() + "\nSalario: " + super.getSalario()+
                           "\nRamal: " + super.getRamal());
        
    }
}
