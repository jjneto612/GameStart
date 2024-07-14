import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input=new Scanner(System.in);
        int adminOrClient;
        System.out.println("Por favor indique que tipo de utilizador é:\n1.Admin\n2.Cliente");
        adminOrClient=input.nextInt();
        if (adminOrClient==1){

            Admin_Menu.adminMenuStart();
        } else if (adminOrClient==2) {

            Client_Menu.clientMenuStart();
        }

        }
    }