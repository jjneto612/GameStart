import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fillArray {
//Método que retorna uma matriz consoante o ficheiro que for passado. Deverá ser true quando for passado o ficheiro dos admins pois o cabeçalho conta, false para todos os outros.
    public static String[][] fillArray(String path, boolean imprimirCabecalho) throws FileNotFoundException {


        File file=new File(path);
        Scanner sc=new Scanner(file);
        Scanner s=new Scanner(file);
        String linhas = sc.nextLine();

        String[] linhas1 = linhas.split(";");
        System.out.println();
        int count = 0;
        int arraySize=0;
        while (s.hasNextLine()){
            linhas=s.nextLine();
            arraySize++;
        }



        Scanner scanner=new Scanner(file);


        if (!imprimirCabecalho){

            scanner.nextLine();
            arraySize--;
        }
        String[][] arrayFicheiros=new String[arraySize][linhas1.length];
        while (scanner.hasNextLine()){

            linhas=scanner.nextLine();
            linhas1=linhas.split(";");
            for (int i = count; i < arrayFicheiros.length ; i++) {

                for (int j = 0; j < arrayFicheiros[i].length; j++) {

                    arrayFicheiros[i][j] = linhas1[j];
                }
            }

            count++;


        }

        return arrayFicheiros;
    }
}
