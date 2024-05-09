import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner escaner = new Scanner(System.in).useLocale(Locale.US);

        while(true){    
            int numb1 = 0;
            while (true){
                try{
                    System.out.println("Digite o primeiro número:");
                    numb1 = escaner.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    System.err.println("O número deve ser inteiro.");
                    escaner.nextLine();
                }
            }

            int numb2 = 1;
            while (true){
                try{
                    System.out.println("Digite o segundo número:");
                    numb2 = escaner.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    System.err.println("O número deve ser inteiro.");
                    escaner.nextLine();
                }
            }
        
            if(numb1 < numb2){
            Contar(numb1, numb2);

            break;
            }
            else{
                System.err.println("O segundo número deve ser maior que o primeiro, tente novamente.");
            }
            
        }
        
        escaner.close();
    }

    

    static void Contar(int numb1, int numb2) throws numerosInvalidosException{
        int contagem = numb2 - numb1;
        //System.out.println(contagem);
        System.out.println("Contando abaixo:");
        for(int inicio = 1; inicio <=contagem; inicio++){
            System.out.println(inicio);
        }
    }

    public static class numerosInvalidosException extends Exception{

    }
    
}
