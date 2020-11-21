package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);


        int num,i=1;

        System.out.print("INGRESE UN NUMERO DE LA TABLA: ");
        num=teclado.nextInt();

        while (i <= 10) {
            System.out.println(num + "x" + i + "=" +num*i);
            i++;

        }







    }
}
