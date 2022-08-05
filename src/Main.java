public class Main {

    public static void main(String[] args) {
        suma(10,20,30);
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puerta);
    }

    public static int suma(int param1, int param2, int param3) {
        int resultant = param1 + param2 + param3;
        System.out.println(resultant);
        return resultant;
    }
}
class Coche{
        public int puerta = 4;

        public void AñadirPuerta(){
            this.puerta++;
        }
}



