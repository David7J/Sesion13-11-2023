import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        
        Vehiculo vehiculo = new Vehiculo("Verde", 4, 4, 200000, true, true); 
        Carro chevrolette = new Carro(2, 4, 4, true, true, "Rojo", 4, 250000, 4);
        vehiculo.Vehiculo2();
        


        lector.close();
    }
}
