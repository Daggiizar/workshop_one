package objects;

/**
 * Esta clase representa una veterinaria mostrando a mascotas y dueños
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class Vet {

    /**
     * Representa el nombre del dueño de la mascota
     */
    public String ownerName;
    /**
     * Representa el nombre de la mascota
     */
    public String petName;
    /**
     * Representa el estadod de salud de la mascota
     */
    protected boolean sick;

    /**
     * Constructor de la clase
     * @param ownerName Dueño de la mascota
     * @param petName nombre de la mascota
     * @param sick estado de salud de la mascota
     */
    public Vet(String ownerName, String petName, boolean sick) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.sick = sick;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }
}
