package animales;

/**
 *
 * @author Manuel
 */
public class Ave {

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static Ave imprimir_cabecera(String nombre_especie, double envergadura, double peso) {
        return new Ave(nombre_especie, envergadura, peso);
    }

//Aquí se almacena la información del pájaro
    private String especie;
    private double envergadura;
    private double peso;

    public Ave() {
    }

    private Ave(String nombre_especie, double envergadura, double peso) {
        this.especie = nombre_especie;
        this.envergadura = envergadura;
        this.peso = peso;
    }

    public String getNombre_especie() {
        return getEspecie();
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre_especie(String nombre_especie) {
        this.setEspecie(nombre_especie);
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
