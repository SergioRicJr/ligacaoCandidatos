package ex2;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Main {
    public static void main(String[] args) {
       contador();        
    }

    static void contador() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scan.nextInt();

        try {
            if (n1>n2) {
                throw new ParametroMaiorException();
            } else {
                System.out.println("-----------------");
                for (int i=n1; i<=n2; i++) {
                    System.out.println(i);
                }
            }
        } catch(ParametroMaiorException e) {
            System.out.println(e.getMessage());
        }
    }
}
