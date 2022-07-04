package objects;

/**
 * Esta clase representa una tienda de musica de los 80's
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class StoreMusic {

    /**
     * Representa el nombre de la tienda
     */
    public String nameStore;
    /**
     * Representa el nonbre del propietario de la tienda
     */
    private String owner;
    /**
     * Representa el genero de la musica
     */
    private String genre;
    /**
     * Representa el record de ventas de la tienda
     */
    public int recordSold;

    /**
     * Constructor de la clase
     * @param nameStore nombre de la tienda
     * @param owner propietario de la tienda
     * @param recordSold record de ventas
     */
    public StoreMusic(String nameStore, String owner, int recordSold) {
        this.nameStore = nameStore;
        this.owner = owner;
        this.recordSold = recordSold;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getOwner() {
        return owner;
    }

    public int getRecordSold() {
        return recordSold;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Metodo que imprime por consola el mensaje "Aca encuentras solo música de los 80´s"
     */
    public void genre(){
        System.out.println("Aca encuentras solo música de los 80´s");
    }

}
