import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddingnewClient {
//método vai validar novo cliente.
    public static void addingNewUser()  {

        Scanner input=new Scanner(System.in);

        String nome;
        int contacto;
        String email;
        System.out.print("Por favor insira o seu nome: ");
        nome=input.nextLine();

        System.out.print("Por favor insira o seu contacto: ");
        contacto=input.nextInt();
        System.out.print("Por favor insira o seu email: ");
        email=input.nextLine();

        System.out.println("Cliente inserido com sucesso:" + nome + "|" + contacto + "|" + email);

    }
}
