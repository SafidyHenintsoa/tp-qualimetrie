/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trientie;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author inclu
 */
public class TriEntie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("entrer votre liste à trier et les separer  par \",\" (par exemple 1,5,6):");
        Scanner scanner = new Scanner(System.in);
        String listeString = scanner.nextLine();
        String[] listes = listeString.split(",");
        int n = listes.length;
        int[] liste = new int[n];
        for (int i = 0; i < n; i++) {
            liste[i]=Integer.parseInt(listes[i]);  
        }
        System.out.println("Liste non triée : " + Arrays.toString(liste));
        int[] listTrieCroissant = triCroissant(liste);
        System.out.println("Liste triée croissante: " + Arrays.toString(listTrieCroissant));
        int[] listTrieDecroissant = triDeCroissant(liste);
        System.out.println("Liste triée decroissante: " + Arrays.toString(listTrieDecroissant));
    }
    
    public static int[] triCroissant(int[] liste) {
        int n = liste.length;
        boolean echange;
        
        do {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (liste[i] > liste[i + 1]) {
                    
                    int temp = liste[i];
                    liste[i] = liste[i + 1];
                    liste[i + 1] = temp;
                    echange = true;
                }
            }
            
            n--;
        } while (echange);
        return liste;
    }
    
    public static int[] triDeCroissant(int[] liste) {
        int n = liste.length;
        boolean echange;
        
        do {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (liste[i] < liste[i + 1]) {
                    
                    int temp = liste[i];
                    liste[i] = liste[i + 1];
                    liste[i + 1] = temp;
                    echange = true;
                }
            }
            
            n--;
        } while (echange);
        return liste;
    }
    
}
