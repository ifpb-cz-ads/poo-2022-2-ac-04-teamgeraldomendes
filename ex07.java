import java.util.Scanner;

public class ex07{
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int num, y;
        System.out.print("Informe um número: ");
        num = entrada.nextInt();
        
        do {
        if (num % 2 == 0) {
            y = num/2;
            num = y;
            System.out.printf("%d -> ", num);
        }
        else if (num % 2 != 0) {
            y = 3 * num + 1; 
            num = y;
            System.out.printf("%d -> ", num);
        }
        } while (num != 1);
        entrada.close();
    
    }
       
}