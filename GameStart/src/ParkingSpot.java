public class ParkingSpot {
//Método printará os lugares disponiveis.
    public static void triangularNumbers(){

        int max=0;
        boolean stop=true;
        System.out.print("Temos disponiveis os seguintes lugares para estacionamento: ");
        for (int i = 1; max<121; i++) {

            max+=i;
            if (max%5==0){
                System.out.print(max+ "||");
            }

        }
    }
}
