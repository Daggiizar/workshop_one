package objects;

import java.util.ArrayList;

/**
 * Esta clase representa una fruta
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class Fruit {

    /**
     * Representa el nombre de la fruta
     */
    public String name;
    /**
     * Representa el peso promedio de una fruta
     */
    private float averageWeight;
    /**
     * Representa un arreglo de colores
     */
    public ArrayList<Color> colors;

    /**
     * Constructor de la clase
     * @param name nombre de la fruta
     */
    public Fruit(String name) {
        this.name = name;
        this.colors = new ArrayList<>();
    }

    public void setColors(String name){
        this.name = name;
    }

    public ArrayList<Color> getColors(){
        return this.colors;
    }

    /**
     * Metodo que nos muestra las frutas en Stock
     */
    public void exoticFruit(){
        if (colors.isEmpty()){
            System.out.println("Stock vacio");
        }else{
            for (int i = 0; i < colors.size(); i ++){
                System.out.println(colors.get(i));
            }
        }
    }
}
