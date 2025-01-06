package br.com.giovanni;

public class Forca {
    public static int verificadorDeForca(String nome){
        int forca = 0;

        if(nome.length() >= 8){
            forca++;
        }

        if(nome.matches(".*[A-Z].*")){
            forca++;
        }

        if(nome.matches(".*[a-z].*")){
            forca++;
        }

        if(nome.matches(".*\\d.*")){
            forca++;
        }

        if(nome.matches(".*[!@#$%^&*()\\-+_?<>].*")){
            forca++;
        }
        return forca;
    }
}
