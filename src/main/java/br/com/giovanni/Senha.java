package br.com.giovanni;

import java.util.Scanner;

public class Senha {
    public void verificadorDeSenha(){
        var scanner = new Scanner(System.in);
        var forte = new Forca();

        System.out.println("Digite sua senha: ");
        String senha = scanner.next();

        int forca = forte.verificadorDeForca(senha);

        if(forca <= 2){
            System.out.println("Senha Fraca");
        } else if (forca == 3) {
            System.out.println("Senha Média");
        } else if (forca == 4) {
            System.out.println("Senha Forte");
        }else {
            System.out.println("Senha Muito Forte");
        }
        scanner.close();
    }
}
