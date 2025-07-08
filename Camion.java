public class Camion extends Vehiculo {
    protected int cargaMaxima;
public Camion(String patente, int año, String dueño, int cargaMaxima) {
    super(patente, año, dueño);
    this.cargaMaxima = cargaMaxima;
}
@Override
    public double calcularImpuestos() {
        return  8000 + 100 * cargaMaxima;
    }
}
