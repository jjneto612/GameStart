import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchClient {
//Método que irá receber um input do user(id do cliente) e irá printar os dados correspondentes.
    public static void getClient() throws FileNotFoundException{

        String[][] clients= fillArray.fillArray("GameStart_Clientes.csv",false);
        Scanner input=new Scanner(System.in);
        System.out.println("Por favor insira o id do cliente que pretende pesquisar:");
        double id=input.nextInt();
        double currentId;

        for (int i = 0; i < clients.length; i++) {

            currentId=Double.parseDouble(clients[i][0]);


            for (int j = 0; j < clients[i].length; j++) {

                if (currentId==id) {

                    for (int k = 1; k < 4; k++) {

                        System.out.print(clients[i][k] +"||");
                    }

                }
                break;
            }
           
        }



    }
}
