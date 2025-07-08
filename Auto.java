public class Auto extends Vehiculo {
    protected int cantidadPuertas;
    public Auto(String patente, int año, String dueño, int cantidadPuertas) {
    super(patente, año, dueño);
    this.cantidadPuertas = cantidadPuertas;
    }
        @Override
        public double calcularImpuestos() {
        return 5000 + 500 * cantidadPuertas;
    }
}