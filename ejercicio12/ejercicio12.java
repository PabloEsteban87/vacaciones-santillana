public class ejercicio12 {

    String marca = null;
    int modelo = 0;
    int motor = 0;
    int numeroPuertas = 0;
    int cantidadAsientos = 0;
    int  velocidadMaxima = 0;
    int velocidadActual = 0;
    tipoCom tipoCombustible;
    tipoA tipoAutomovil;
    tipoColor tipocolor;



    public ejercicio12(String marca, int modelo, int motor, int numeroPuertas, int cantidadAsientos,
             tipoCom tipoCombustible, tipoA tipoAutomovil, tipoColor tipocolor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
/*         this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual; */
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.tipocolor = tipocolor; 
    }

     public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getModelo() {
        return modelo;
    }


    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    public int getMotor() {
        return motor;
    }


    public void setMotor(int motor) {
        this.motor = motor;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }


    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }


    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }


    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }


    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }


    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }


    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }


    public tipoColor getTipocolor() {
        return tipocolor;
    }


    public void setTipocolor(tipoColor tipocolor) {
        this.tipocolor = tipocolor;
    }



    public enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL 
    };

     public enum tipoA {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV 
    };

       public enum tipoColor {
       BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    };

    void acelerar(int incrementoVelocidad){
        setVelocidadMaxima(120);
        if (incrementoVelocidad > 0){
            int resultado =  getVelocidadActual() + incrementoVelocidad;
            setVelocidadActual(resultado);
            System.out.println("La velocidad actual es: " + resultado);
        }
        if(getVelocidadActual() > getVelocidadMaxima()){
            System.out.println("Esa velocidad es demasiada alta");

        }


    }

    void desacelerar(int decrementoVelocidad){
        if(getVelocidadActual() >= 0){
        int resultado = getVelocidadActual() - decrementoVelocidad;
        setVelocidadActual(resultado);
        System.out.println("La velocidad actual es: " + resultado);
        }
        else{
            System.out.println("La velocidad no puede ser menos que cero");
        }

    }

    void frenar(){

    }

    double calcularTiempoLlegada(int distancia){
        double resultado = distancia / getVelocidadActual();
        return resultado;
    }

    void imprimir(){
    System.out.println("Los asientos son: " + getCantidadAsientos());
    System.out.println("La marca es: " + getMarca());
    System.out.println("El modelo es: " + getModelo());
    System.out.println("El motor es: " + getMotor());
    System.out.println("El numero de puertas es: " + getNumeroPuertas());
    System.out.println("El tipo de automovil es: " + getTipoAutomovil());
    System.out.println("El tipo de combustible es: " + getTipoCombustible());
    System.out.println("El tipo de color es: " + getTipocolor());
    }
    

    public static void main(String args[]) {

    ejercicio12 Automovil = new ejercicio12("Marca", 1, 150, 5, 5, tipoCom.DIESEL, tipoA.CIUDAD, tipoColor.AZUL);

    Automovil.imprimir();
    Automovil.setVelocidadActual(100);
    Automovil.acelerar(20);
    Automovil.desacelerar(50);
    System.out.println(Automovil.calcularTiempoLlegada(200) + " horas");
        
    }
}
