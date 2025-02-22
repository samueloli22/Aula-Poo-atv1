
package Ativ;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Conta {
    private double saldo;
    private String nome;

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void depositar(double valor, double percentual){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu nome por favor ");
        String nome = scan.nextLine();
        this.nome = nome;
        System.out.println("Digite o valor do deposito ");
        valor = scan.nextDouble();
        System.out.println("digite a porcenatagem ");
        percentual = scan.nextDouble();
        percentual = percentual/100;
        this.saldo = this.saldo +valor+(valor*percentual);
        
    }
    
}
