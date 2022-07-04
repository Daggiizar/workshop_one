package objects;

import java.util.Scanner;

public class Main {

    /**
     * Representa el punto de entrada de la aplicacion
     * @param args Datos de entrada desde la consola
     */
    public static void main(String[] args) {


        /**
         * Se Crea el objeto persona el cual imprime un mensaje por consola
         */
        Person person = new Person();
        System.out.println("Hola! " + person.getName()
                + " " + person.lastName1 + " "
                + "\nSu altura es: " + person.getHeight());

        /**
         * Se Crea el objeto persona2 el cual imprime un mensaje por consola
         */
        Person person2 = new Person("Roberto", "Rodriguez", 1.65F);
        System.out.println("Hola! " + person2.getName() + " " + person2.getLastName1());
        person2.setName("Pepo");
        System.out.println("Su nuevo nombre es: " + person2.getName() + " " + person2.getLastName1());

        System.out.println("--------------------------------------------------//-------------------------------------------");

        /**
         *  Se crea el objeto fruta donde se crea una colección de frutas exoticas
         */

        Fruit fruit = new Fruit("Importadas");

        fruit.exoticFruit();

        fruit.getColors().add( new Color("Gulupa", "Morado"));
        fruit.getColors().add( new Color("Kiwi", "verde"));
        fruit.getColors().add( new Color("Carambola", "Amarillo"));
        fruit.getColors().add( new Color("Lychee", "Rojo"));

        fruit.exoticFruit();

        System.out.println("--------------------------------------------------//-------------------------------------------");

        /**
         * Se crea el objeto cuenta de Banco mostrando un mensaje por consola si esta activada o no la cuenta
         */
        BankAccount bank = new BankAccount();
        bank.accountStatus();
        bank.activatedAccount();
        bank.accountStatus();

        System.out.println("--------------------------------------------------//-------------------------------------------");

        /**
         * Se crea el objeto Hotel el cual muestra por consola si hay habitaciones disponibles
         */
        Hotel hotel = new Hotel();
        System.out.println("Afiliados a la cadena de hoteles: " + hotel.getNameChain()
                + " con sede en " + hotel.getHeadquarterHotel());
        hotel.availableRooms();

        System.out.println("--------------------------------------------------//-------------------------------------------");

        /**
         * Se cre el objeto tienda de Música el cual muestra por consola el record de ventas
         */
        StoreMusic storeMusic = new StoreMusic("That '80s Show", "Michael Kelso", 25000);
        System.out.println("Bienvenidos a " + storeMusic.getNameStore()
                + " los recibe su dueño " + storeMusic.getOwner()
                +  " con un record de ventas por mes de " + storeMusic.getRecordSold());
        storeMusic.genre();

        System.out.println("--------------------------------------------------//-------------------------------------------");

        /**
         * Se crea el objeto Veterinaria el cual pide la edad de la mascota y la muestra por consola
         */
        Vet vet = new Vet("Aleja", "Zisi", false);
        System.out.println("Hola! " + vet.getOwnerName() + " que edad tiene " + vet.getPetName());
        System.out.println("Introduzca la edad de su mascota por favor: ");
        String input = "";
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        System.out.println("La edad de " + vet.getPetName() + " es "  + input + " años");

    }
}
