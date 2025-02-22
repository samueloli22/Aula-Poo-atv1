
package Ativ;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class UsaConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta ctt = new Conta();
        Conta ctt2 = new Conta();
        ctt2.setNome("Arthur");
        ctt2.setSaldo(100);
        int opc =2;
        do{
            System.out.println("Digite qual opçao deseja navegar");
            System.out.println("1- Recalcular Saldo");
            System.out.println("0 - sair");
            int opc1 = scan.nextInt();
            if(opc1==1){
                
                ctt.depositar(0, 0);
                System.out.println("Nome: "+ ctt.getNome());
                System.out.println("Saldo "+ctt.getSaldo());
            }else if(opc1==0){
                System.out.println("thank you for used my program ");
                opc=0;
                
            }else{
                System.out.println("Ops tente novamente");
            }
            
        }while( opc !=0);
        
         
      //System.out.printf("Conta 1 saldo \n", ctt.getSaldo());
        //System.out.println("Conta 1 nome "+ctt.getNome());
        //System.out.printf("Conta 2 saldo \n", ctt2.getSaldo());
        //System.out.println("Conta 2 nome "+ctt2.getNome());
        
        
                
        
    }
    
}
