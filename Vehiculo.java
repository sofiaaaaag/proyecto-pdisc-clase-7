public abstract class Vehiculo {
    protected String patente;
    protected int año;
    protected String dueño;

    public Vehiculo(String patente,int año,String dueño) {
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    } 
    public int getAño() {
        return año;
    }
    public String getDueño() {
        return dueño;
    }
     public String getPatente() {
        return patente;
    }
    public void mostrarDatos() {     
    }
     public abstract double calcularImpuestos();
}