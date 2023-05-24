/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahmedddd;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
 public class contaAltezza {
     
     public void SommaInput() {
   {
        int somma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; somma < 100; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = input.nextInt();
            somma += numero;
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}
     
     
    public  void SommaMedia(){  //es 10
    Scanner input = new Scanner(System.in);
    System.out.print("Inserisci il numero di dati da leggere: ");
     int n = input.nextInt(); // legge il numero di dati da leggere
     int[] numeri = new int[n]; // crea un array di lunghezza n per i dati
     System.out.println("Inserisci i dati:");
     int somma = 0;
     for (int i = 0; i < n; i++) {
          numeri[i] = input.nextInt(); // legge i dati uno alla volta
          somma = somma + numeri[i]; // aggiunge il valore alla somma
      }
      double media = somma / n; // calcola la media
      System.out.println("La somma dei dati è: " + somma);
      System.out.println("La media dei dati è: " + media);
      
      
      
 }
    
    public void ContaNumeriMinoriDiDieci() {
        
        
     {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        for (int i = 1; i <= 11; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int numero = input.nextInt();
            if (numero < 10) {
                counter++;
            }
        }

        System.out.println("Hai inserito " + counter + " numeri minori di 10.");
    }
}
    
    
    
  

//24. Dati i voti riportati da alcuni studenti in una prova, stabilisci quanti sono insufficienti e quanti sono sufficienti


public void ContaVoti ()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int insufficienti = 0, sufficienti = 0;

        System.out.print("Inserisci il numero di voti: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Inserisci il voto dello studente " + i + ": ");
            int voto = sc.nextInt();
            if (voto < 6) {
                insufficienti++;
            } else {
                sufficienti++;
            }
        }

        System.out.println("Numero di voti insufficienti: " + insufficienti);
        System.out.println("Numero di voti sufficienti: " + sufficienti);
    }
    
    
public  void SommaDispari() {
    {
        int somma = 0;
        for (int i = 1; i <= 10; i += 2) {
            somma += i;
        }
        System.out.println("La somma dei numeri dispari da 1 a 10 è: " + somma);
    }
}


public  void SommaPrimiDieciNumeri() {
 {
        int somma = 0;
        for (int i = 1; i <= 10; i++) {
            somma += i;
        }
        System.out.println("La somma dei primi 10 numeri è: " + somma);
    }
}
}



    
  
    

