public class metodo {
    public int [][] LlenarMatrizEntera(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return matriz;
    }
     
    public void MostrarMatrizEntera(int[][] matriz){
        
            for (int i = 0; i < matriz[i].length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }




    public ObjMatriz[][] LlenarMatrizObjeto(ObjMatriz[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new ObjMatriz((int) (Math.random() * 50 + 1));

                matriz[i][j] = 0;
            }
        }
        return matriz;
    }

    public void MostrarMatrizObjeto(ObjMatriz[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" - " + matriz[i][j].getDato());
            }    
        }
        
    public void imprimirDiagonalSuperior(ObjMatriz[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    System.out.print(" - " + matriz[i][j].getDato());
                }
            }
            System.out.println();
        }
    }
}
