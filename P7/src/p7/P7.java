/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static p7.P7_1.mai;

/**
 *
 * @author LENOVO
 */
public class P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                 P7_1 llamadoMatriz = new P7_1();
        
        int[][] matriz;      
        int[][] matriz2;     
        int[][] matriz3;    
        int[][] matriz4;
        int[][] matriz5;    
        int[][] matriz6;
        int[][] matriz7;      
        int[][] matriz8;
        int[][] matriz9;
       
        
        matriz = llamadoMatriz.Matriz();
        matriz2 = llamadoMatriz.Matriz();
        
        matriz7 = matriz;
        matriz8 = matriz2;
        matriz9 = matriz;
        
        System.out.println("matriz 1:");
        llamadoMatriz.imprimirM(matriz);
        llamadoMatriz.MatrizC(matriz);
        
        System.out.println("matriz 2:");
        llamadoMatriz.imprimirM(matriz2);
        llamadoMatriz.MatrizC(matriz2);
        
        matriz3 = llamadoMatriz.sumaM(matriz, matriz2);
        llamadoMatriz.imprimirM(matriz3);
        llamadoMatriz.MatrizC(matriz3);
        
        matriz3 = llamadoMatriz.restaM(matriz, matriz2);
        llamadoMatriz.imprimirM(matriz3);
        llamadoMatriz.MatrizC(matriz3);
       
        System.out.println("Multiplicaion Matriz:");
        matriz3 = llamadoMatriz.multiplicacionM(matriz, matriz2);
        llamadoMatriz.imprimirM(matriz3);
        llamadoMatriz.MatrizC(matriz3);
        
        System.out.println("Suma de filas de matriz1");
        llamadoMatriz.sumaF(matriz);
        System.out.println("Suma de columas de matriz1");
        llamadoMatriz.sumaC(matriz);
        
        System.out.println();
        System.out.println("Suma de filas de matriz2");
        llamadoMatriz.sumaF(matriz2);
        System.out.println("Suma de columas de matriz2");
        llamadoMatriz.sumaC(matriz2);
        
        System.out.println();
        if(llamadoMatriz.MatrizS(matriz)){
            JOptionPane.showMessageDialog(null, "Correccto, la matriz uno es simétrica");
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, la matriz uno no es simétrica");
        }
        
        if(llamadoMatriz.MatrizS(matriz2)){
            JOptionPane.showMessageDialog(null, "Correccto, la matriz dos es simétrica");
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, la matriz dos no es simétrica");
        }
        
        System.out.println("Matriz1 inversa:");
        matriz4 = llamadoMatriz.matrizI(matriz7);
        llamadoMatriz.imprimirM(matriz4);
        
        System.out.println("Matriz2 inversa:");
        matriz5 = llamadoMatriz.matrizI(matriz8);
        llamadoMatriz.imprimirM(matriz5);
        
        System.out.println("Matriz transpuesta");
        matriz6 = llamadoMatriz.matrizT(matriz9);
        llamadoMatriz.imprimirM(matriz6);
        
         int [][] m = new int [3][3];
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese dato de la fila: " +1);
                    int d = sc.nextInt();
                    m [i][j] = d;
                }
        }
            mai(m);
    }
    
}
