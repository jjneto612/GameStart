import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class validatingAdmin {
//Método que irá validar o admin. Irá receber 2 inputs do user e verificará com o ficheiro dos admins.
    public static boolean validatingAdmin() throws FileNotFoundException {

        File file=new File("GameStart_Admins.csv");
        Scanner sc=new Scanner(file);
        String linha=sc.nextLine();
        String[] primeriaLinha=linha.split(";");
        int arraySize=0;
        while (sc.hasNextLine()){

            linha=sc.nextLine();
            arraySize++;

        }

        int count=0;
        String[][] arrayAdmins=new String[arraySize+1][primeriaLinha.length];
        Scanner scanner=new Scanner(file);
        int condition=arrayAdmins.length-1;
        int minus=arrayAdmins.length-1;
        while (scanner.hasNextLine()){

            linha=scanner.nextLine();
            primeriaLinha=linha.split(";");
            for (int i = count; i < arrayAdmins.length ; i++) {

                for (int j = 0; j < arrayAdmins[i].length; j++) {

                    arrayAdmins[i][j] = primeriaLinha[j];
                }

            }
            count++;
        }

        int match=0;

        boolean stop=true;
        int tries=0;
        Scanner input=new Scanner(System.in);
        String username;
        String password;
        while (stop){

            System.out.print("Por favor insira o seu username:");
            username=input.nextLine();
            System.out.print("Por favor insira a sua password:");
            password=input.nextLine();
        for (int i = 0; i < arrayAdmins.length; i++) {

            for (int j = 0; j < arrayAdmins[i].length; j++) {

                if (username.equals(arrayAdmins[i][0]) && password.equals(arrayAdmins[i][1])){
                    match++;
                }
            }
        }

        if (match>0){

            System.out.println("Login Efetuado com sucesso");
            stop=false;
            return true;

        }else {

            System.out.println("Tentativa de login falhada.");
            tries++;
        }
        if (tries==3){

            System.out.println("Esgotou o limite de tentativas.");
            stop=false;
            return false;
        }
    }
        return false;
}

}
