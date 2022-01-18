public class Driver{
    public static void main(String[] args) {
        Controladora controladora = new Controladora();
        System.out.println("Bienvenido a IRadio");

        controladora.GeneralStatus();//le provee informacion importante antes que el usuario empiece a usar la radio
        controladora.ProgramLogic();//en este metodo se encuentra la logica del programa
    }
}