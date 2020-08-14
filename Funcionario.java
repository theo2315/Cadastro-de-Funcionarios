
package Setores;

public abstract class Funcionario extends Pessoa {
    protected double salario;
    protected int ramal;

    public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String documento){
        super(nome, documento);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    
    public String verificaFuncao(){
        String papel;
        
        if(getRamal() == 1){
            papel = "Presindente";
        }else if(getRamal() > 10  && getRamal() < 15){
            papel = "Secretaria";
        }else{
            papel = "Vendedor";
        }
        
        return papel;
    }
    
    public double calculaSalarioAnual(){
        double decimoTerceiro = this.getSalario();
        double salarioAno;
        
        salarioAno = (this.getSalario() * 12) + decimoTerceiro;
        return salarioAno;
    }
    
}
