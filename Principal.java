
package mapa2;

import Setores.Cliente;
import Setores.Funcionario;
import Setores.Presidente;
import Setores.Secretaria;
import Setores.Vendedor;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
   
        String senha;
        
        // Criando os objetos
        Funcionario p1 = new Presidente("Asdrubal Leôncio Correa", "5.912.131");
       
        Funcionario s1 = new Secretaria("Fatima", "6.231.971");
        
        Funcionario s2 = new Secretaria("Ana", "2.513.927");
        
        Vendedor v1 = new Vendedor("João", "3.861.214");
        
        Vendedor v2 = new Vendedor("Vanessa", "5.612.871");
        
        Vendedor v3 = new Vendedor("Carlos", "8.515.261");
       
        Cliente c1 = new Cliente("Cliente", "Marcos","Marcos", "2.710.231");
        
        Cliente c2 = new Cliente("Cliente", "Joana", "Joana", "11.231.915");
        
        Cliente c3 = new Cliente("Cliente", "Elisa", "Elisa", "7.901.528");
        
        Cliente c4 = new Cliente("Cliente", "Lucas", "Lucas", "8.653.879");
        
        p1.setRamal(1);
        p1.setSalario(3000);
        
        s1.setRamal(12);
        s1.setSalario(1500);
        
        s2.setRamal(14);
        s2.setSalario(1500);
        
        v1.setRamal(17);
        v1.setSalario(900);
        v1.setComissao(250);
        
        
        v2.setRamal(16);
        v2.setSalario(1050);
        v2.setComissao(300);
        
        v3.setRamal(19);
        v3.setSalario(1200);
        v3.setComissao(200);
        
        c1.setSenha("123456");
        
        c2.setSenha("123456");
        
        c3.setSenha("123456");
        
        c4.setSenha("segredo");
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Exibindo dados dos funcionarios da empresa... Pressione 'ENTER' para continuar...");
        System.in.read();
        p1.exibeDados();
        System.out.println("Salario anual: " + p1.calculaSalarioAnual());
        System.out.println("");
        s1.exibeDados();
        System.out.println("");
        s2.exibeDados();
        System.out.println("Salario anual: " + s2.calculaSalarioAnual());
        System.out.println("");
        v1.exibeDados();
        System.out.println("");
        v2.exibeDados();
        System.out.println("");
        v3.exibeDados();
        System.out.println("");
                    
        System.out.println("Exibindo dados dos clientes cadastrados.... Pressione 'ENTER' para continuar...");
        System.in.read();
        c1.exibeDados();
        System.out.println("");
        c2.exibeDados();
        System.out.println("");
        c3.exibeDados();
        System.out.println("");
        c4.exibeDados();
        System.out.println("");
                 
        System.out.println("Executando login de clientes.... Pressione 'ENTER' para continuar");
        System.in.read();
                    
        System.out.println("Usuario: " + c1.getUsuario());
        System.out.println("Informe a senha do usuario: ");
        senha = tec.next();
        while(!c1.verificarSenha(senha)){
             System.out.println("Senha invalida! Tente novamente");
             senha = tec.next();
        }
        System.out.println("");
                    
        System.out.println("Usuario: " + c2.getUsuario());
        System.out.println("Informe a senha do usuario: ");
        senha = tec.next();
        while(!c2.verificarSenha(senha)){
            System.out.println("Senha invalida! Tente novamente");
            senha = tec.next();
        }
        System.out.println("");
                    
        System.out.println("Usuario: " + c3.getUsuario());
        System.out.println("Informe a senha do usuario: ");
        senha = tec.next();
        while(!c3.verificarSenha(senha)){
            System.out.println("Senha Invalida! Tente novamente");
            senha = tec.next();
        }
        System.out.println("");
                    
        System.out.println("Usuario: " + c4.getUsuario());
        System.out.println("Informe a senha do usuario: ");
        senha = tec.next();
        while(!c4.verificarSenha(senha)){
            System.out.println("Senha invalida! Tente novamente");
            senha = tec.next();
        }
        System.out.println("");
    }
    
}
