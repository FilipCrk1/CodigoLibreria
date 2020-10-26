/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class P7_1 extends P7 {
    
    public int[][] Matriz() throws IOException{
        
        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        int[][] M;
        int C, F;
        
        F = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de filas"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de columnas"));
        
        M = new int [F][C];
        System.out.println("Ingresar los datos");
        for (int i=0; i < F; i++){
            for (int j=0; j < C; j++){
                System.out.println("Ingresa valor para la casilla ["+i+"]["+j+"] ");
                entrada = bufer.readLine();
                M[i][j] = Integer.parseInt(entrada);
                
            }     
        }
        return M;
    }
    
    public void imprimirM(int[][] m){
        for (int i=0; i < m.length; i++){
            for (int j=0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void MatrizC( int [][] a){
        
        if( a.length != a[0].length){
            System.out.println("*La matriz no es cuadratica*");
        } else {
            System.out.println("*Matriz cuadratica*");
        }
        
    }
    
    public int[][] sumaM(int[][] matriz1, int[][] matriz2){
         int[][] m3 = new int[matriz1.length][matriz1[0].length];
        
        if( matriz1.length == matriz2.length ){
            for (int i=0; i < matriz1.length; i++){
                for (int j=0; j < matriz1[0].length; j++){
                    m3[i][j] = matriz1[i][j] + matriz2[i][j];

                }
            }
            System.out.println("Suma de matrices:");
            return m3;
        } else {
                System.out.println("No se puede realizar la operacion de suma, matriz original no es cuadartica:");
            return matriz1;
        }
    }
    
    public int[][] restaM(int[][] matriz1, int[][] matriz2){
        int[][] m3 = new int[matriz1.length][matriz1[0].length];
        
        if( matriz1.length == matriz2.length ){
            for (int i=0; i < matriz1.length; i++){
                for (int j=0; j < matriz1[i].length; j++){
                    m3[i][j] = matriz1[i][j] - matriz2[i][j];

                }
            }
            System.out.println("Resta de matrices:");
            return m3;
        } else {
                System.out.println("No se puede realizar la operacion de resta, matriz original no es cuadratica:");
            return matriz1;
        }
    }
    
    public void sumaF(int[][] matriz1){
        int sumaFilas = 0;
        int [] arreglo = new int [1];
        
        for (int i=0; i < matriz1.length; i++){
            for (int j=0; j < matriz1[i].length; j++){
                sumaFilas += matriz1[i][j];
                
            }
            for ( int j=0; j < arreglo.length; j++){
                arreglo[j] = sumaFilas;
                System.out.print(arreglo[j]+", ");
            }
            
            sumaFilas = 0;
        }
        System.out.println();
    }
    
    public void sumaC(int[][] matriz){
        int sumaFilas = 0;
        int [] arreglo = new int [1];
        
        for (int i=0; i < matriz[0].length; i++){
            for (int j=0; j < matriz.length; j++){
                sumaFilas += matriz[j][i];
            }
            for ( int h=0; h < arreglo.length; h++){
                    arreglo[h] = sumaFilas;
                    System.out.print(arreglo[h]+", ");
                    sumaFilas = 0;
                }
        }
        
    }
    
    public int[][] matrizI(int [][] matriz){
        
        int aux = 0;
        
        for (int i= matriz.length - 1 ; i >= 0; i--){
            for (int j= matriz[i].length - 1; j >= 0; j--){
                aux = aux + 1;
                matriz[i][j] = aux;
            }
        }
        return matriz;
    }
    
    public int[][] matrizT( int[][] matriz){
        int aux;
        
        
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        return matriz;
    }
    
    public int[][] multiplicacionM(int[][] matriz1, int[][] matriz2){
        
        int[][] mResultante = new int [matriz1.length][matriz2[0].length];
        
        if ( matriz1.length != matriz2.length){
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int h = 0; h < matriz1[0].length; h++) {
                        mResultante[i][j] += matriz1[i][h] * matriz2[h][j];
                    }                   
                }
            }
            return mResultante;
        } else {
            System.out.println("no se puede realizar la operacion por la dimensiones de la matriz:");
            return matriz1;
        }
        
    }
    
    public boolean MatrizS( int matriz[][] )
{
    for ( int fila=1; fila < matriz.length; fila++ )
    {
        for ( int columna=0; columna < fila; columna++ )
        {
            if ( matriz[fila][columna] != matriz[columna][fila] )
            {
                return false;
            }
        }
    }
    return true;
}
    public int[][] MatrizCaracol(int n, int x) {
        int[][] Matriz = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                Matriz[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                Matriz[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                Matriz[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                Matriz[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            Matriz[n / 2 + 1][n / 2 + 1] = x;
        }
        return Matriz;
    }
    
    public void mostrarMatrizCaracol(int[][] M, int filas, int columnas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
        MatrizC(M);
    }
  public static void mai(int [][]m) {
        // TODO code application logic here
        int sumaFil = 0;
        int sumaCol = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFil += m[i][j];
                sumaCol += m[i][j];
            }
            if (igual(sumaFil, sumaCol)) {
                count ++;
                if (count == 3) {
                    System.out.println("El cuadro es magico");
                    mostrar(m);
                }else{
                    sumaFil = 0;
                    sumaCol = 0;
                }
            }else{
                System.out.println("El cuadro no es magico");
                mostrar(m);
                return;
            }
        }
    }
    static boolean igual(int sumaFil, int sumaCol){
        return sumaFil == sumaCol;
    }
    static void mostrar(int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println();
        }
    }
}
