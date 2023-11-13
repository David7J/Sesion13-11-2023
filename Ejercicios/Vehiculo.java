public class Vehiculo {
    
private String color;
private int puertas;
private int ventanas;
private int kilometraje;
private boolean cajuela;
private boolean matricula;

    public Vehiculo(String color, int puertas, int ventanas, int kilometraje, boolean cajuela, boolean matricula){
        this.color = color;
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.kilometraje = kilometraje;
        this.cajuela = cajuela;
        this.matricula = matricula;
    }


    public void Vehiculo2(){
        System.out.println("El vehiculo esta listo. ");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isCajuela() {
        return cajuela;
    }

    public void setCajuela(boolean cajuela) {
        this.cajuela = cajuela;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    



}
