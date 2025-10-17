package com.mycompany.ejercicios00;

import java.util.Scanner;

public class Ejercicios00 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int hc = 0, urgen = 0, contr = 0, gene = 0, edad;
        String genero, tipoconsulta;
        System.out.println("ingrese numero de historia clinica (-1 para finalizar): ");
        hc = dato.nextInt();

        while (hc != -1) {
            System.out.println("ingrese genero(M/F):");
            genero = dato.nextLine();
            System.out.println("ingrese edad");
            edad = dato.nextInt();

            System.out.println("ingrese el tipoconsulta(urgencia, control o general)");
            tipoconsulta = dato.nextLine();
            if (tipoconsulta.equalsIgnoreCase("urgencia")) {
                urgen++;
            } else if (tipoconsulta.equalsIgnoreCase("control")) {
                contr++;
            } else if (tipoconsulta.equalsIgnoreCase("general")) {
                gene++;
            }
            {
                System.out.println("ingrese numero de historia clinica (-1 para finalizar");
                hc = dato.nextInt();
                System.out.println(" urgencia: " + urgen + "  control " + contr + "  general " + gene);
            }
        }
    }
}
