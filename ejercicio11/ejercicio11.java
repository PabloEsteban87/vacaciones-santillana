
public class ejercicio11 {

    String nombre = null;
    int cantidadsatelites = 0;
    Double masa = 0.0;
    Double volumen = 0.0;
    int diametro = 0;
    long  distanciaSol = 0;
    boolean esObservable = false;
    tipoPlaneta tipoplaneta;


    public enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    };

    public ejercicio11(String nombre, int cantidadsatelites, Double masa, Double volumen, int diametro,
            long distanciaSol, tipoPlaneta tipoplaneta, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadsatelites = cantidadsatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoplaneta = tipoplaneta;
        this.esObservable = esObservable;
    }

    void imprimir() {
        System.out.println(tipoplaneta);
    }

    double calcularDensidad(Double masa, Double volumen){
        return masa/volumen;
    }

    boolean esPlanetaExterior(){
        double resultado = 3.4 * 149597870;
        if(distanciaSol > resultado){
            return true;
        }
        return false;
    }

    public static void main(String args[]) {

            ejercicio11 Tierra = new ejercicio11("Tierra", 1, 5.9736e24 , 1.08321e12, 63781, 150000000, tipoPlaneta.TERRESTRE,  false);
            ejercicio11 Pluton = new ejercicio11("Pluton", 5, 1.30e22, 7.06e9, 23767, 5906376272L, tipoPlaneta.ENANO, false);
            
            //Tierra
            Tierra.imprimir();
            System.out.println(Tierra.calcularDensidad(5.9736e24, 1.08321e12));
            System.out.println(Tierra.esPlanetaExterior());

            //Plutón
            Pluton.imprimir();
            System.out.println(Pluton.calcularDensidad(1.30e22, 7.06e9));
            System.out.println(Pluton.esPlanetaExterior());
    }
}
