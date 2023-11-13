import java.util.Scanner;

public class Carro extends Vehiculo {

    Scanner lector = new Scanner(System.in);

    private int espejo;
    private int asientos;
    private int llantas;


    public Carro(int espejo, int asientos, int llantas, boolean cajuela, boolean matricula, String color, int puertas, int kilometraje, int ventanas) {
        super(color, puertas, ventanas, kilometraje, cajuela, matricula);
        this.espejo = espejo;
        this.asientos = asientos;
        this.llantas = llantas;
    }

    public String dirigir(String dirigir){
        System.out.println("Desea cambiar grados");
        dirigir = lector.nextLine();
        return dirigir;
    }

    public String Palanca(String palanca){
       System.out.println("Desea cambiar de velocidad (1,2,3,4,5,R)");
       palanca = lector.nextLine();
       return palanca;
    }

    public int desplazarse(int desplazarse){
        System.out.println("Escoja que velocidad desea: ");
        System.out.println("1) Acelerar ");
        System.out.println("2) Decrementar ");
        desplazarse = lector.nextInt();

        if(desplazarse == 1){
            System.out.println(getVehiculo() + " Esta acelerando");
        }
        else if(desplazarse == 2){
            System.out.println(getVehiculo() + " Esta descrementando");
        }else{
            System.out.println("Opcion invelida");
        }

        return desplazarse;
    }
}