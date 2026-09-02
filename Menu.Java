import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        metodos = new metodo();
        int n = 0;
        System.out.print("Ingrese la dimension de la matriz: ");
        n = scanner.nextInt();
        int[][] matrizEntera = new int[n][n];
        ObjMatriz[][] matrizObjeto = new ObjMatriz[n][n];
        while (continuar) {
            System.out.println("Que desea realizar 1: llenar matriz de enteros");
            System.out.println("2 Mostrar matriz enteros");
            System.out.println("3 llenar matriz de objetos");
            System.out.println("4 mostrar matriz 0");
            System.out.println("5 mostrar matriz diagonal superior");
            System.out.println("6 salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    matrizEntera = metodos.LlenarMatrizEntera(matrizEntera);
                    break;
                case 2:
                    metodos.MostrarMatrizEntera(matrizEntera);
                    break;
                case 3:
                    matrizObjeto = metodos.LlenarMatrizObjeto(matrizObjeto);
                    break;
                case 4:
                    metodos.MostrarMatrizObjeto(matrizObjeto);
                    break;
                case 5:
                    metodos.imprimirDiagonalSuperior(matrizObjeto);
                    break;
                case 6:
                    System.out.println("Saliendo es saliendo");
                    continuar = false;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}