public class metodo {
    public int [][] LlenarMatrizEntera(int[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
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
}
