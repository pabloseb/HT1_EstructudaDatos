/**
 * @author Pablo Sebastian Herrera
 * @since 16/01/2022
 * @version 1.0
 * 
 * Clase controladora para respetar el MVC del programa. 
 */
import java.util.Scanner;
public class Controladora {

    Controladora(){}

    Manejadora ex = new Manejadora();//se instancia este objeto para manejar las excepciones cometidas por el usuario
    Scanner scanner = new Scanner(System.in);//para permitir ingreso de informacion al usuario por el teclado
    IRadio radio = new IRadio(true, "FM",530, 87.9, 530, 540, 530, 530, 530, 530, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9);//constructor clase IRadio. 
    double[] AMList = new double[6];//arreglo definido de 6 items para la lista que guarda en AM
    double[] FMList = new double[6];//arreglo definido de 6 items para la lista que guarda en FM

    String entrada;//variable que guarda informacion de entrada del usuario
    int opcion;//opcion que pueda escoger el usuario en los menus
    boolean val_entrada;//valida que la entrada del usuario sea correcta, depende de la clase manejadora
    boolean program = true;//para mantener el bucle infinito, a menos que el usuario apague el radio

    /**
     * Metodo que brinda informacion importante de la radio. Ademas, guarda las emisoras favoritas del usuario dependiendo de lo que haya en el constructor
     */
    public void GeneralStatus(){

        //se agregan las emisoras favoritas del constructor a sus respectivas listas
        AMList[0] = radio.getEmisora_Favorita1();
        AMList[1] = radio.getEmisora_Favorita2();
        AMList[2] = radio.getEmisora_Favorita3();
        AMList[3] = radio.getEmisora_Favorita4();
        AMList[4] = radio.getEmisora_Favorita5();
        AMList[5] = radio.getEmisora_Favorita6();
    
        FMList[0] = radio.getEmisora_Favorita7();
        FMList[1] = radio.getEmisora_Favorita8();
        FMList[2] = radio.getEmisora_Favorita9();
        FMList[3] = radio.getEmisora_Favorita10();
        FMList[4] = radio.getEmisora_Favorita11();
        FMList[5] = radio.getEmisora_Favorita12();

        System.out.println("------------------------------------------------------------");
        System.out.println("Informacion General Radio\n");    

        //por default el radio se encuentra encendido para que el usuario lo pueda usar. De apagarlo, finaliza el programa, aunque depende del metodo definido luego y del valor en el constructor
        if(radio.getStatus() == false){
            System.out.println("La radio actualmente se encuentra apagada");
        }else{
            System.out.println("La radio actualmente se encuentra encendida");
        }
        //brinda informacion de que modulacion se encuentra el usuario dependiendo del constructor. Puede ser Frecuencia Modulada (FM) o Amplitud Modulada (AM)
        if(radio.getModulacion() == "FM"){
            System.out.println("Actualmente la radio se encuentra en FM");
        }else{
            System.out.println("Actualmente la radio se encuentra en AM");
        }
        System.out.println("------------------------------------------------------------");
    }

    /**
     * Este metodo proporciona toda la logica del programa. En este se muestra el menu, se mantiene el bucle y se cumplen las funcionalidades
     */
    public void ProgramLogic(){

    //se inicia con instrucciones para el usuario, aunque es intuitivo, pero para mantener un programa amigable
    System.out.println("Por favor, escoja una opcion del menu");
    //debido a que es una simulacion, a menos que el usuario apague el radio, sus funcionalidades siempre estaran
    while(program == true){
        //verifica la modulacion, dependiendo de eso, entrega informacion actual de la emisora actual o mas bien la que fue colocada en el constructor inicialmente
        do{
            System.out.println("---------------------------------------------------------");
            if(radio.getModulacion() == "AM"){
                System.out.println("La emisora actual es: "+radio.getEmisora_ActualAM()+" "+radio.getModulacion());
            }
            else{
                System.out.println("La emisora actual es: "+radio.getEmisora_ActualFM()+" "+radio.getModulacion());
            }

            //luego de desplegar la informacion inicial, se le muestra un menu con todas las opciones que puede hacer
            System.out.println("1.Encender/Apagar Radio");
            System.out.println("2.Cambiar Modulacion AM/FM");
            System.out.println("3.Siguiente Emisora");
            System.out.println("4.Emisora Anterior");
            System.out.println("5.Escoger una emisora Favorita Guardada");//puede ver las emisoras que tiene guardadas dependiendo de la modulacion
            System.out.println("6.Hacer Favorita a la Emisora Actual");//puede escoger la emisora actual como una favorita en el espacio que quiera
            entrada = scanner.nextLine();//entrada de informacion del usuario por teclado
            val_entrada = ex.MenuInicial(entrada);//verifica entrada informacion del usuario
        }while(val_entrada == false);//se repite el menu si el usuario no ingresa un dato correcto o si la opcion no se encuentra en el menu

        opcion = Integer.parseInt(entrada);//se obtiene la opcion escogida en el menu

        switch(opcion){
            //cambia el estado de la radio, empieza estando encendido, pero si se apaga el radio, se finaliza la simulacion
            case 1:
            radio.CambiarEstadoRadio();
            if(radio.getStatus() == false){
                System.exit(0);
            }
            break;

            //permite cambiar de AM a FM y viceversa
            case 2:
            radio.CambiarModulacion();
            break;

            //permite cambiar a la siguiente emisora, dependiendo de la modulacion que se encuentre
            case 3:
            radio.EmisoraSiguiente();
            break;

            //permite regresar a la emisora pasada, dependiendo de la modulacion en la que se encuentre
            case 4:
            radio.EmisoraPasada();
            break;

            //despliega una lista con todas las emisoras favoritas declaradas (inicialmente por el programador en el constructor, pero luego depende del usuario y su interaccion con el programa)
            case 5:
            radio.EscogerEmisoraFavorita(AMList, FMList);//utiliza listas para facilitar la programacion, en este caso dos, ya que depende bastante de si se encuentra en AM o FM
            break; 

            //Hace que la emisora actual, dependiendo de la modulacion, sea agregada a una lista, en el espacio que el usuario quiera agregarla
            case 6:
            radio.EditarEmisorasFavorita(AMList, FMList);//nuevamente se utilizaron dos listas para facilitar la programacion. Ademas, las emisoras favoritas en AM son totalmente diferentes a las emisoras favoritas en FM
            break;
        }
      }    
    }

}
