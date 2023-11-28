package herencia;
    abstract class Vehiculo{
        protected String marca;
        public Vehiculo(String marca){
            this.marca = marca;
        }	
        public void arrancar(){
            System.out.println("Arrancando el vehiculo");
        }
    }
    abstract class Automovil extends Vehiculo{
        private String modelo;
        public Automovil(String marca, String modelo){
            super(marca);
            this.modelo = modelo;
        }
        public void conducir(){
            System.out.println("counduciendo el automóvil");
        }
    }
      
public class Herencia{
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Renault","Clio"){};
        miAuto.arrancar();
        miAuto.conducir();
    }
}
