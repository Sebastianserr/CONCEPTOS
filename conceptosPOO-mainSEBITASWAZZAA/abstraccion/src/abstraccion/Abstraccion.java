package abstraccion;
abstract class Auto{
    String marca;
    String modelo;
    //Constructor
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String obtenerInformacion(){
        return "Marca: " + marca + "n/ Modelo: " + modelo;
    }
}
public class Abstraccion {
    public static void main(String[] args) {
        Auto miAuto = new Auto("toyota", "Corolla"){};
        System.out.println(miAuto.obtenerInformacion());
    }
    
}
