package Ativ;
import java.util.Date;

/**
 *
 * @author samue
 */
public class ImportData {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println("A data de Hoje em mili segundos "+dt.getTime());
        ImportData dd = new ImportData();
        dd.getimprimirData();
        int num1 =10;
        int num2=20;
        dd.verificar(num1, num2);
        
        
        
        
        
    }
    public void getimprimirData(){
        Date dt2 = new Date();
        System.out.println(dt2.getTime());
        
    }
            
    public void verificar(int d1, int d2){
        if(d1>d2){
            System.out.println("esse e maior numero "+ d2);
        }else if(d1==d2){
            System.out.println("Os numeros sao iguais ");
            
        }else{
            System.out.println("Esse numero e maior "+d2);
        }
        
    }
    
    
}
