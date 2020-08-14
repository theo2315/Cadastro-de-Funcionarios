package Setores;

public final class Cliente extends Pessoa{
    private String usuario;
    private String senha;
    private String papel;
    
    public Cliente(){
        super();
    }
    
    public Cliente(String papel, String nome, String usuario, String documento){
        super(nome, documento);
        this.setPapel(papel);
        this.setUsuario(usuario);
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
    
    public boolean verificarSenha(String senha){
        
        System.out.println("Verificando senha: " + senha);
        if(senha.equals(getSenha())){
            System.out.println("Login efetuado com sucesso!");
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void exibeDados(){
        System.out.println("Papel: " + this.getPapel() +"\nNome: " + super.getNome() + "\nDocumento: "
                           + super.getDocumento() + "\nUsuario: " + this.getUsuario() + "\nSenha: " + this.getSenha());
    }
}
