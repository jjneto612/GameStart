import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Método que printará o ficheiro de copyright quando o programa for terminado.
public class PrintCopyright {

    public static void printCopyright(String path) throws FileNotFoundException {

        File file=new File(path);
        Scanner sc=new Scanner(file);
        String linha;

        while (sc.hasNextLine()){

            linha=sc.nextLine();
            System.out.println(linha);

        }
    }
}
