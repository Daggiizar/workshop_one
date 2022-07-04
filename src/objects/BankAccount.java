package objects;

/**
 * Esta clase representa una cuenta bancaria donde muestra el estado de la cuenta
 * @author Daniel Zárate
 * @version 1.0.0
 */
public class BankAccount {

    /**
     * Representa el numero de la cuenta
     */
    private int accountNumber;
    /**
     * Representa el estado de la cuenta
     */
    protected boolean activated;

    public void setActivated(boolean activated){
        this.activated = activated;
    }

    public boolean getActivated(){
        return this.activated;
    }

    /**
     * Representa que la cuenta esta activada
     */
    public void activatedAccount(){
        this.activated = true;
        System.out.println("La cuenta esta activada");
    }

    /**
     * Metodo que nos indica si la cuenta esta o no activada
     */
    public void accountStatus(){
        if (activated == true){
            System.out.println("La cuenta esta activada");
        }else{
            System.out.println("La cuenta esta desactivada");
        }
    }



}
