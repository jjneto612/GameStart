import java.io.FileNotFoundException;

public class ProfitCategory {
//Método que printará para a consola a categoria mais rentável e o respectivo lucro.
    public static void profitCategory() throws FileNotFoundException {

        String[][] categories=fillArray.fillArray("GameStart_categorias.csv",false);
        String [][] vendas=fillArray.fillArray("GameStart_Vendas.csv",false);

        String[][] vendasCategorias=new String[16][2];

        for (int i = 0; i < categories.length; i++) {

            String category=categories[i][0];
            double rate=Double.parseDouble(categories[i][1])/100;
            double total=0;
            for (int j = 0; j < vendas.length; j++) {

                if (vendas[j][3].equals(category)){

                    total+=Double.parseDouble(vendas[j][5]) * rate;
                }

            }

            vendasCategorias[i][0]=category;
            vendasCategorias[i][1]=Double.toString(total);
        }

        double num= Double.parseDouble(vendasCategorias[0][1]);
        String bestCategory=vendasCategorias[0][0];
        double profitCategory = 0;
        for (int i = 0; i < vendasCategorias.length; i++) {

            if (Double.parseDouble(vendasCategorias[i][1])>num){

                bestCategory=vendasCategorias[i][0];
                profitCategory= Double.parseDouble(vendasCategorias[i][1]);
            }
        }

        System.out.println("A categoria mais rentável é: " + bestCategory);
        System.out.println("Obtendo um lucro de " + Double.toString(profitCategory));
    }
}
