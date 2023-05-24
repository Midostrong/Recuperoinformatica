/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ahmedddd;

/**
 *
 * @author ahmed
 */
import java.util.Scanner;
import java.lang.Exception;

public class Ahmedddd {

    public static void main(String[] args) {
       
        
      int scelta = 0;
        System.out.println("Inserire:\n1 per gli esercizi fatti con le classe\n2 per gli esercizi fatti in maniera procedurali");
      try{
      Scanner in = new Scanner(System.in);
      scelta= in.nextInt();
      }catch(Exception e){
          System.out.println("errore");
      }
switch (scelta) {
    case 1: 
       
         //oggetto prima classe chiamata per classe perchè e' un metodo static
        contaAltezza oggContAlt = new contaAltezza() ; //oggetto di tipo contaaltezza
         //chiamare il metodo con l'istanza di tipo contaaltezza
         
        oggContAlt.SommaInput();
        oggContAlt.ContaNumeriMinoriDiDieci();
        oggContAlt.ContaVoti();
        oggContAlt.SommaDispari();
        oggContAlt.SommaMedia();
        oggContAlt.SommaPrimiDieciNumeri();
        break;
   
    default: 
        System.out.println("scelta errata");
        
}
        
        
        
        
    }
}
/*
import javax.swing.*;

public class MultipleFrames {
    public static void main(String[] args) {
        // Pannello 1
        JFrame frame1 = new JFrame("Pagina 1");
        frame1.setSize(400, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Pannello 2
        JFrame frame2 = new JFrame("Pagina 2");
        frame2.setSize(400, 200);
        
        // Pannello 3
        JFrame frame3 = new JFrame("Pagina 3");
        frame3.setSize(400, 200);
        
        // Mostra frame1
        frame1.setVisible(true);
        
        // Quando premiamo il pulsante in frame1, nascondi frame1 e mostra frame2
        JButton button1 = new JButton("Vai a pagina 2");
        button1.addActionListener(e -> {
            frame1.setVisible(false);
            frame2.setVisible(true);
        });
        frame1.add(button1);
        
        // Quando premiamo il pulsante in frame2, nascondi frame2 e mostra frame3
        JButton button2 = new JButton("Vai a pagina 3");
        button2.addActionListener(e -> {
            frame2.setVisible(false);
            frame3.setVisible(true);
        });
        frame2.add(button2);
    } 
}
*/