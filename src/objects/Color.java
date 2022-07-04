package objects;

/**
 * Esta clase representa nombres y color para ser llamados en la clase Fruit
 */
public class Color {

    /**
     * Representa el nombre de una fruta
     */
    private String nameFruit;
    /**
     * Representa el nombre de un color
     */
    private String color;

    /**
     * Constructor de la clase
     * @param nameFruit nombre de una fruta
     * @param color nombre de un color
     */
    public Color(String nameFruit, String color) {
        this.nameFruit = nameFruit;
        this.color = color;
    }

    /**
     *
     * Sobreescribe el método toString
     * @Override
     */

    public String toString() {
        return "Color{" +
                "name='" + nameFruit + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
