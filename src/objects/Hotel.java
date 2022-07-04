package objects;

/**
 * Esta clase representa un hotel y habitaciones disponibles
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class Hotel {

    /**
     * Representa el nommbre de la cadena de hoteles
     */
    protected String nameChain;
    /**
     * Representa el nombre de la sede del hotel
     */
    public String headquarterHotel;
    /**
     * Representa si hay habitaciones disponibles
     */
    private boolean room = true;

    /**
     * Constructor inicializado de la clase
     */
    public Hotel() {
        this.nameChain = "Barcelona";
        this.headquarterHotel = "Catalunya";
    }

    /**
     * Constructor de la clase
     * @param nameChain nombre de la cadena
     * @param headquarterHotel sede del hotel
     * @param room habitaciones
     */
    public Hotel(String nameChain, String headquarterHotel, boolean room) {
        this.nameChain = nameChain;
        this.headquarterHotel = headquarterHotel;
        this.room = room;
    }

    public String getNameChain() {
        return nameChain;
    }

    public void setNameChain(String nameChain) {
        this.nameChain = nameChain;
    }

    public String getHeadquarterHotel() {
        return headquarterHotel;
    }

    public void setHeadquarterHotel(String nameChain) {
        this.headquarterHotel = nameChain;
    }

    /**
     * Metodo que nos indica la disponibilidad de habitaciones
     */
    public void availableRooms() {
        if (room == false){
            System.out.println("No hay habitaciones disponibles");
        }else{
            System.out.println("Hay habitaciones disponibles");
        }

    }


}
