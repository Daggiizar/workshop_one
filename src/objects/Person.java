package objects;

import java.util.Date;

/**
 * Esta clase representa una persona con datos personales
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class Person {

    /**
     * Representa el nombre de una persona
     */
    public String name;
    /**
     * Representa el primer apellido de una persona
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de una persona
     */
    public String lastName2;
    /**
     * Representa la fecha de cumpleaños
     */
    public Date dateBirth;
    /**
     * representa la altura de una persona
     */
    public float height;

    /**
     * Constructor inicializado de la clase
     */
    public Person() {
        this.name = "Daniel";
        this.lastName1 = "Zarate";
        this.height = 1.76F;
    }

    /**
     * Constructor de la clase
     * @param name nombre de la persona
     * @param lastName1 primer apellido de una persona
     * @param height altura de una persona
     */
    public Person(String name, String lastName1, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public String getLastName1() {
        return lastName1;
    }

    public float getHeight() {
        return height;
    }
}
