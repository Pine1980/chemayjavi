

//Este programa crea dos objetos Vehiculo
class Vehiculo {
    int pasajeros;  
    int capacidad;    
}

//Esta clase declara un objeto de tipo Vehiculo
class PrimeraClase {
    public static void main(String[] args) {
        Vehiculo autocar = new Vehiculo();
        Vehiculo coche = new Vehiculo();

        //asignando valores a los campos de autocar
        autocar.pasajeros = 9;
        autocar.capacidad = 1500;
        //asignando valores a los campos de coche
        coche.pasajeros = 10;
        coche.capacidad = 250;
		
        System.out.println("El autocar puede llevar " + autocar.pasajeros + " pasajeros con una capacidad de carga de " + autocar.capacidad + " litros");
        System.out.println("El coche puede llevar " + coche.pasajeros + " pasajeros con una capacidad de carga de " + coche.capacidad + " litros");
    }
}