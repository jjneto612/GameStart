import java.io.FileNotFoundException;

public class bestClients {

    public static String[][] getClientIDSales() throws FileNotFoundException{

        String[][] vendas= fillArray.fillArray("GameStart_Vendas.csv",false);
        String[][] clientes= fillArray.fillArray("GameStart_Clientes.csv",false);
        String currentId=" ";
        String[][]idAndSales=new String[90][2];
        for (int i = 0; i < clientes.length; i++) {
            double total=0;
            currentId=clientes[i][0];
            
            for (int j = 0; j < vendas.length; j++) {

                for (int l = 0; l < vendas[i].length; l++) {

                    if ((vendas[j][l]).equals(currentId)) {

                        total+=Double.parseDouble(vendas[j][5]);

                    }

                }

            }

            idAndSales[i][0]=currentId;
            idAndSales[i][1]=Double.toString(total);
        }

        return idAndSales;
    }

    public static void getBestClients() throws FileNotFoundException {

        String[][] clients = fillArray.fillArray("GameStart_Clientes.csv",false);
        String[][] idAndSales=getClientIDSales();
        String[][] vendas=fillArray.fillArray("GameStart_Vendas.csv",false);

        double bestClient=Double.parseDouble(idAndSales[0][1]);
        String clientId=idAndSales[0][0];
        for (int i = 0; i < idAndSales.length; i++) {

            for (int j = 0; j < idAndSales[i].length; j++) {

                if (Double.parseDouble(idAndSales[i][j])>bestClient){

                    clientId=idAndSales[i][0];
                }
            }
        }

        System.out.print("O seu melhor cliente é:");

        for (int i = 0; i < clients.length; i++) {

            for (int j = 0; j < clients[i].length; j++) {

                if (clients[i][j].equals(clientId)){

                    for (int k = 1; k < 4; k++) {

                        System.out.print(clients[i][k] + "||");
                    }

                    break;

                }

            }
        }

        System.out.println();
        System.out.println("Gastou: " + idAndSales[0][1] +"€");
        System.out.println("E comprou os seguintes jogos:");
        for (int i = 0; i < vendas.length; i++) {

            if (vendas[i][1].equals(clientId)){

                System.out.println(vendas[i][4]);
            }

        }


    }

}
