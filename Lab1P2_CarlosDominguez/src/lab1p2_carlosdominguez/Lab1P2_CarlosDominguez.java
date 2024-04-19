//fila 2, asiento 9 , Carlos Dominguez
package lab1p2_carlosdominguez;
import java.util.Scanner;
import java.util.Random;
public class Lab1P2_CarlosDominguez {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void main(String[] args) {
        System.out.println("--Mediana de medianas--");
        boolean vef = true;
        int tamaño;
        do {
            System.out.println("Ingrese el tamanio de matriz deseado : ");
            tamaño = sc.nextInt();
            if (tamaño > 4 && tamaño%2 != 0) {
                //evitar que el numero no sea menor que 4 y impar
                vef = false;
            }else{
                //repite hasta que ingrese un valor correcto
                System.out.println("El numero tiene que ser mayor que 4 y impar");
            }
        } while (vef);
        int [][] matriz = new int [tamaño][tamaño];
        matriz = llenado_Random(matriz);
        System.out.println("");
        System.out.println("Matriz Generada : ");
        imprimir(matriz);
        // para el bubble sort me dio una idea 
        //usar la recursiva para recorrer las filas de la matriz 
        //y adentro del metodo hacer el swap para ordenar
        int control_recursiva = tamaño-1;
        // el -1 es para evitar que se salga de los bounds
        matriz = Ordenamiento_filas(matriz,control_recursiva);

    }
    
    //llenado de la matriz con random
    public static int [][] llenado_Random (int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=rd.nextInt(9);
            }
        }
        return matriz;
    }
    public static void imprimir(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
    public static int [][] Ordenamiento_filas (int [][] matriz,int CR){
        int [] arreglo_temp = new int [matriz.length];
        if (CR != 0) {
            for (int i = 0; i < matriz.length; i++) {
                arreglo_temp [i] = matriz[CR][i];
            }
            for (int i = 0; i < arreglo_temp.length; i++) {
                for (int j = 0; j < arreglo_temp.length; j++) {
                    if (arreglo_temp[j]>arreglo_temp[j+1]) {
                        
                    }
                }
            }
            /*for (int i = 0; i < matriz.length; i++) {
                if (i != 0 && i != matriz.length) {
                    if (matriz[CR][i]>matriz[CR][i]) {
                        
                    }
                }
            }
            */
            Ordenamiento_filas(matriz,CR-1);
        }
        return matriz;
    }
}
