package com.mycompany.ejercicio17_switch;

import java.util.Scanner;

public class Ejercicio17_switch {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int hc, urgen = 0, contr = 0, gene = 0, edad, op;
        String genero;

        System.out.println("ingrese numero de historia clinica (-1 para finalizar): ");
        hc = dato.nextInt();

        while (hc != -1) {

            System.out.println("ingrese genero");
            genero = dato.next();
            System.out.println("ingrese edad");
            edad = dato.nextInt();
            System.out.println("====TIPO DE CONSULTAS====");
            System.out.println("1=urgencia");
            System.out.println("2=control");
            System.out.println("3=general");
            op = dato.nextInt();

            switch (op) {
                case 1:
                    urgen++;
                    break;
                case 2:
                    contr++;
                    break;
                case 3:
                    gene++;
                    break;
                default:
                    System.out.println("onpcion incorrecta");
                    break;

            }

            System.out.println("ingrese numero de historia clinica (-1 para finalizar");
            hc = dato.nextInt();

        }
        System.out.println(" urgencia: " + urgen);
        System.out.println(" control: " + contr);
        System.out.println(" general: " + gene);
    }
}
