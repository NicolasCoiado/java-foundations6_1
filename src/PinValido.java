import java.util.Scanner;
public class PinValido {
    public static void main(String [] args){
        int entrada = 0;
        Scanner sc = new Scanner(System.in);
        int pin = 2345678;
        while (entrada!=pin) {
            System.out.print("Digite o número pin: ");
            entrada = sc.nextInt();
        }
        System.out.println("PIN correto, conta acessada!");
    }
}
