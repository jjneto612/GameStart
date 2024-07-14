import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readPrintFiles {
//Método que printará para  aconsola as matrizes que forem paassadas como parametros. Deverá ser true para o ficheiro dos admins e false para os restantes.
    public static void readFiles(String [][] matriz, boolean imprimirCabecalho) throws FileNotFoundException {

        if (imprimirCabecalho) {


            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {
    
                    System.out.print(matriz[i][j] + "||");
                }
    
                System.out.println();
            }

        }else{

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {
    
                    System.out.print(matriz[i][j] + "||");
                }
    
                System.out.println();
            }
        }

}
}
