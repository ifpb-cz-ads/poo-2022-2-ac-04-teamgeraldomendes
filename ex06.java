import java.util.Scanner;

public class ex06{
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int dia;
        
        do {
        System.out.print("Informe um número entre 1 e 7: ");
        dia = entrada.nextInt();
        
        if (dia < 0 || dia > 7) {
            System.out.print("Número inválido!\n");
        }
        else if (dia == 1) {
            System.out.println("Domingo"); 
        }
        else if (dia == 2) {
            System.out.println("Segunda-feira"); 
        }
        else if (dia == 3) {
            System.out.println("Terça-feira");
        }
        else if (dia == 4) {
            System.out.println("Quarta-feira"); 
        }
        else if (dia == 5) {
            System.out.println("Quinta-feira");
        }
        else if (dia == 6) {
            System.out.println("Sexta-feira"); 
        }
        else if (dia == 7) {
            System.out.println("Sábado");
        }

        } while (dia != 0);
    
        entrada.close();
    
    }
       
}