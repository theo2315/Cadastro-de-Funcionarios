package Setores;

public class Vendedor extends Funcionario{
    private double comissao;
    
    public Vendedor(){
        super();
    }
    
    public Vendedor(String nome, String documento){
        super(nome, documento);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    public double salarioMesComissao(){
        return (super.getSalario() + comissao);
    }
    
   @Override
    public void exibeDados(){
        System.out.println("Papel: " + super.verificaFuncao() + "\nNome: " + super.getNome() + 
                           "\nDocumento: " + super.getDocumento() + "\nSalario: " + super.getSalario() +
                           "\nRamal: " + super.getRamal() + "\nSalario com Comissao: " + this.salarioMesComissao());
    }
}
