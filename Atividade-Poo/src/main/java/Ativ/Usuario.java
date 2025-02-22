
package Ativ;

/**
 *
 * @author samue
 */
public class Usuario {
    private int id;
    private String nome;
    private String endereço;
    private String email;
    private byte receita;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getEmail() {
        return email;
    }

    public byte getReceita() {
        return receita;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }
    
    public double desconto(double valor){
        if(valor>100){
            double call = valor*0.15;
            return call;
        }else{
            double call2;
            call2 = valor *0.10;
            return call2;
        }
        
    }
    public static void main(String[] args) {
        double num1 = 160.50;
        Usuario usu = new Usuario();
        System.out.println(usu.desconto(num1));
    }
    
            
    
}
