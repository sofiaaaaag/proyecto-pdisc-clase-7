public class Registromunicipal {
    public void buscarPorAño(Vehiculo[] vehiculos, int año) {
        System.out.println("filto por año");  
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getAño() == año) {
                vehiculos[i].mostrarDatos();
                System.out.println(vehiculos[i].getAño());
                System.out.println(vehiculos[i].getDueño());
                System.out.println(vehiculos[i].getPatente());
            }                                       
        }
    }
        
    public void buscarPorDueño(Vehiculo[] vehiculos, String dueño) {  
        System.out.println("filto por dueño");  
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getDueño() == dueño) {
                vehiculos[i].mostrarDatos();
                System.out.println(vehiculos[i].getAño());
                System.out.println(vehiculos[i].getDueño());
                System.out.println(vehiculos[i].getPatente());
            }
        }
    }
}
