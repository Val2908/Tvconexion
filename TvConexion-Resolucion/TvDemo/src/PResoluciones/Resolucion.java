package PResoluciones;

/**
 * Class Resolucion
 */
public class Resolucion {

    //
    // Fields
    //
    private int largo;
    private int ancho;

    //
    // Constructors
    //
    //Herrera improvement public Resolucion () { };
    /**
     *
     * @param largo
     * @param ancho
     *
     */
    public Resolucion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //
    // Methods
    //
    //
    // Accessor methods
    //
    /**
     * Fija el valor de largo
     *
     * @param newVar el nuevo valor de largo
     */
    public void setLargo(int newVar) {
        largo = newVar;
    }

    /**
     * Devuelve el valor de largo
     *
     * @return el valor de largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Fija el valor de ancho
     *
     * @param newVar el nuevo valor de ancho
     */
    public void setAncho(int newVar) {
        ancho = newVar;
    }

    /**
     * Devuelve el valor de ancho
     *
     * @return el valor de ancho
     */
    public int getAncho() {
        return ancho;
    }

    //
    // Other methods
    //
}
