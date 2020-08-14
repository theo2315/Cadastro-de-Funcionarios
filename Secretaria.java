package Setores;

public class Secretaria extends Funcionario{
    
    public Secretaria(){
        super();
    }
    
    public Secretaria(String nome, String documento){
        super(nome, documento);
    }
    
    
    @Override
    public void exibeDados(){
        System.out.println("Papel: " + super.verificaFuncao() + "\nNome: " + super.getNome() + "\nDocumento: " + super.getDocumento()
                           + "\nSalario: " + super.getSalario() + "\nRamal: " + super.getRamal());
    }
}
