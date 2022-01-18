/**
 * @author Pablo Sebastian Herrera
 * @since 16/01/2022
 * @version 1.0
 * 
 * Clase para manejar excepciones que pueda cometer el usuario a la hora de agregar informacion por su parte. 
 */
public class Manejadora {
    Manejadora(){}

/**
 * Revisa que el usuario este agregando correctamente la informacion que se le pide en el menu principal del programa
 * @param i cadena de texto que ingresa el usuario
 * @return regresa verdadero si no se genera alguna excepcion y si se cumplen los condicionales, de lo contrario regresa falso
 */
    public boolean MenuInicial(String i){
        try{
            int x = Integer.parseInt(i);
            if(x <= 0|| x >6){
                System.out.println("Ingrese una opcion en el menu");
                return false;
            }
            else{
                return true;
            }
        }catch(Exception e){
            System.out.println("El dato que ha ingresado es invalido, intente de nuevo");
            return false;
        }
    }
/**
 * Verifica que el usuario este ingresando unicamente numeros enteros positivos menos que 6
 * @param i cadena de texto que ingresa el usuario
 * @return verdadero si cumple condicionales y no se genera alguna excepcion, de lo contrario es falso
 */
    public boolean VerificarEntradaInt(String i){
        try{
            int x = Integer.parseInt(i);
            if(x<=0 || x > 6 ){
                System.out.println("Escoja una emisora favorita valida");
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            System.out.println("No ha ingresado un tipo de dato valido, intente nuevamente");
            return false;
        }
    }
}
