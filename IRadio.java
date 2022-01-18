/**
 * @author Pablo Sebastian Herrera
 * @since 16/01/2022
 * @version 1.0
 * 
 * objeto Radio. Esta clase definira los metodos de la interfaz y ayudara con la logica del programa 
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class IRadio implements Radio {

    Scanner scanner = new Scanner(System.in);
    Manejadora manejadora = new Manejadora();

    private boolean Status; //radio encendido o apagado 
    private String Modulacion;//AM o FM
    private double Emisora_ActualAM;//Emisora que esta sonando para AM
    private double Emisora_ActualFM;//Emisora que suena en FM
    private double Emisora_Favorita1;//emisora en boton 1
    private double Emisora_Favorita2;//emisora en boton 2
    private double Emisora_Favorita3;//emisora en boton 3
    private double Emisora_Favorita4;//emisora en boton 4
    private double Emisora_Favorita5;//emisora en boton 5
    private double Emisora_Favorita6;//emisora en boton 6
    private double Emisora_Favorita7;//emisora en boton 7
    private double Emisora_Favorita8;//emisora en boton 8
    private double Emisora_Favorita9;//emisora en boton 9
    private double Emisora_Favorita10;//emisora en boton 10
    private double Emisora_Favorita11;//emisora en boton 11
    private double Emisora_Favorita12;//emisora en boton 12

    //constructor de la radio
    IRadio(boolean status,String modulacion,double emisora_actualAM,double emisora_actualFM, double emisora1,double emisora2,double emisora3,double emisora4,double emisora5,double emisora6,double emisora7,double emisora8,double emisora9,double emisora10,double emisora11,double emisora12){
        this.Status = status;
        this.Modulacion = modulacion;
        this.Emisora_ActualAM = emisora_actualAM;
        this.Emisora_ActualFM = emisora_actualFM;
        this.Emisora_Favorita1 = emisora1;
        this.Emisora_Favorita2 = emisora2;
        this.Emisora_Favorita3 = emisora3;
        this.Emisora_Favorita4 = emisora4;
        this.Emisora_Favorita5 = emisora5;
        this.Emisora_Favorita6 = emisora6;
        this.Emisora_Favorita7 = emisora7;
        this.Emisora_Favorita8 = emisora8;
        this.Emisora_Favorita9 = emisora9;
        this.Emisora_Favorita10 = emisora10;
        this.Emisora_Favorita11 = emisora11;
        this.Emisora_Favorita12 = emisora12;
    }

    //setters y getters de los atributos, se utilizaran para manipular las estaciones de radio y mas en el programa
/**
 * modicia si esta encendida o apagada la radio
 * @param status 
 */    
    public void setStatus(boolean status) {
        Status = status;
    }
/**
 * obtiene el estado actual de la radio
 * @return status radio
 */
    public boolean getStatus(){
        return this.Status;
    }
/**
 * establece una nueva emisora actual para AM
 * @param emisora_ActualAM double para emisora AM
 */
    public void setEmisora_ActualAM(double emisora_ActualAM) {
        Emisora_ActualAM = emisora_ActualAM;
    }
/**
 * obtiene la emisora actual AM
 * @return regresa la emisora actual
 */
    public double getEmisora_ActualAM() {
        return Emisora_ActualAM;
    }
/**
 * Establece emisora actual para FM
 * @param emisora_ActualFM
 */
    public void setEmisora_ActualFM(double emisora_ActualFM) {
        Emisora_ActualFM = emisora_ActualFM;
    }
/**
 * obtiene emisora actual para FM
 * @return emisora actual FM
 */
    public double getEmisora_ActualFM() {
        return Emisora_ActualFM;
    }
/**
 * establece o modifica la modulacion ya sea AM o FM
 * @param modulacion modulacion que se desea
 */
    public void setModulacion(String modulacion) {
        Modulacion = modulacion;
    }
/**
 * obtiene la modulacion en la que se encuentra la radio
 * @return modulacion actual
 */
    public String getModulacion() {
        return Modulacion;
    }
/**
 * establece una primera emisora favorita
 * @param emisora_Favorita1 numero emisora favorita
 */
    public void setEmisora_Favorita1(double emisora_Favorita1) {
        Emisora_Favorita1 = emisora_Favorita1;
    }
/**
 * obtiene la primera emisora favorita
 * @return numero emisora
 */
    public double getEmisora_Favorita1() {
        return Emisora_Favorita1;
    }
/**
 * establece la segunda emisora favorita
 * @param emisora_Favorita2 numero segunda emisora
 */
    public void setEmisora_Favorita2(double emisora_Favorita2) {
        Emisora_Favorita2 = emisora_Favorita2;
    }
/**
 * obtiene la segunda emisora favorita
 * @return numero segunda emisora
 */
    public double getEmisora_Favorita2() {
        return Emisora_Favorita2;
    }
/**
 * establece tercera emisora favorita
 * @param emisora_Favorita3 numero tercera emisora
 */
    public void setEmisora_Favorita3(double emisora_Favorita3) {
        Emisora_Favorita3 = emisora_Favorita3;
    }
/**
 * obtiene tercera emisora favorita
 * @return numero tercera emisora
 */
    public double getEmisora_Favorita3() {
        return Emisora_Favorita3;
    }
/**
 * establece emisora favorita 4
 * @param emisora_Favorita4 numero emisora 4
 */
    public void setEmisora_Favorita4(double emisora_Favorita4) {
        Emisora_Favorita4 = emisora_Favorita4;
    }
/**
 * obtiene numero emisora favorita 4
 * @return numero emisora 4
 */
    public double getEmisora_Favorita4() {
        return Emisora_Favorita4;
    }
/**
 * establece emisora favorita 5
 * @param emisora_Favorita5 numero emisora
 */
    public void setEmisora_Favorita5(double emisora_Favorita5) {
        Emisora_Favorita5 = emisora_Favorita5;
    }
/**
 * obtiene numero emisora favorita 5
 * @return numero emisora
 */
    public double getEmisora_Favorita5() {
        return Emisora_Favorita5;
    }
/**
 * establece numero emisora favorita 6
 * @param emisora_Favorita6 numero emisora
 */
    public void setEmisora_Favorita6(double emisora_Favorita6) {
        Emisora_Favorita6 = emisora_Favorita6;
    }
/**
 * obtiene numero emisora 6
 * @return numero emisora
 */
    public double getEmisora_Favorita6() {
        return Emisora_Favorita6;
    }
/**
 * establece emisora favorita 7
 * @param emisora_Favorita7 numero emisora
 */
    public void setEmisora_Favorita7(double emisora_Favorita7) {
        Emisora_Favorita7 = emisora_Favorita7;
    }
/**
 * obtiene numero emisora favorita 7
 * @return numero emisora
 */
    public double getEmisora_Favorita7() {
        return Emisora_Favorita7;
    }
/**
 * establece numero emisora favorita 8
 * @param emisora_Favorita8 numero emisora
 */
    public void setEmisora_Favorita8(double emisora_Favorita8) {
        Emisora_Favorita8 = emisora_Favorita8;
    }
/**
 * obtiene numero emisora favorita 8
 * @return numero emisora
 */
    public double getEmisora_Favorita8() {
        return Emisora_Favorita8;
    }
/**
 * establece emisora favorita 9
 * @param emisora_Favorita9 numero emisora
 */
    public void setEmisora_Favorita9(double emisora_Favorita9) {
        Emisora_Favorita9 = emisora_Favorita9;
    }
/**
 * obtiene numero emisora favorita 9
 * @return numero emisora
 */
    public double getEmisora_Favorita9() {
        return Emisora_Favorita9;
    }
/**
 * establece emisora favorita 10
 * @param emisora_Favorita10 numero emisora
 */
    public void setEmisora_Favorita10(double emisora_Favorita10) {
        Emisora_Favorita10 = emisora_Favorita10;
    }
/**
 * obtiene numero emisora favorita 10
 * @return numero emisora
 */
    public double getEmisora_Favorita10() {
        return Emisora_Favorita10;
    }
/**
 * establece emisora favorita 11
 * @param emisora_Favorita11 numero emisora
 */
    public void setEmisora_Favorita11(double emisora_Favorita11) {
        Emisora_Favorita11 = emisora_Favorita11;
    }
/**
 * obtiene numero emisora favorita 11
 * @return numero emisora
 */
    public double getEmisora_Favorita11() {
        return Emisora_Favorita11;
    }
/**
 * establece numero emisora favorita 12
 * @param emisora_Favorita12 numero emisora
 */
    public void setEmisora_Favorita12(double emisora_Favorita12) {
        Emisora_Favorita12 = emisora_Favorita12;
    }
/**
 * obtiene numero emisora favorita 12
 * @return numero emisora
 */
    public double getEmisora_Favorita12() {
        return Emisora_Favorita12;
    }
///////////////////////////////////////////////////////////////////////////////////
//se implementan los metodos de la interface para radios

@Override
public boolean isOn() {
    return false;
}
//encender y Apagar
@Override
public void turnOnOff() {
    if(this.Status == true){
        this.Status = false;
        System.out.println("La radio se ha Apagado");
    }
    else{
        this.Status = true;
        System.out.println("La radio se ha encendido");
    }
    
}
public void EditarEmisorasFavorita(double[] amList,double[] fmList){
    boolean val_entry;
    String entry;
    int option_chosen;

    if(this.Modulacion == "AM"){
        System.out.println("\n---------------------------------");
        System.out.println("La emisora actual es"+this.Emisora_ActualAM+" Escoja un espacio para guardar esta emisora en sus emisoras favoritas");
        System.out.println("Espacio 1");
        System.out.println("Espacio 2");
        System.out.println("Espacio 3");
        System.out.println("Espacio 4");
        System.out.println("Espacio 5");
        System.out.println("Espacio 6");
        do{
            entry = scanner.nextLine();
            val_entry = manejadora.VerificarEntradaInt(entry);
        }while(val_entry == false);

        option_chosen = Integer.parseInt(entry);
        if(option_chosen == 1){
            amList[0] = this.Emisora_ActualAM;
        }
        if(option_chosen == 2){
            amList[1] = this.Emisora_ActualAM;
        }
        if(option_chosen == 3){
            amList[2] = this.Emisora_ActualAM;
        }
        if(option_chosen == 4){
            amList[3] = this.Emisora_ActualAM;
        }
        if(option_chosen == 5){
            amList[4] = this.Emisora_ActualAM;
        }
        if(option_chosen == 6){
            amList[5] = this.Emisora_ActualAM;
        }
    }
    if(this.Modulacion == "FM"){
        System.out.println("\n---------------------------------");
        System.out.println("La emisora actual es "+this.Emisora_ActualFM+" Escoja un espacio para guardar esta emisora en sus emisoras favoritas");
        System.out.println("Espacio 1");
        System.out.println("Espacio 2");
        System.out.println("Espacio 3");
        System.out.println("Espacio 4");
        System.out.println("Espacio 5");
        System.out.println("Espacio 6");
        do{
            entry = scanner.nextLine();
            val_entry = manejadora.VerificarEntradaInt(entry);
        }while(val_entry == false);

        option_chosen = Integer.parseInt(entry);

        if(option_chosen == 1){
            fmList[0] = this.Emisora_ActualFM;
        }
        if(option_chosen == 2){
            fmList[1] = this.Emisora_ActualFM;
        }
        if(option_chosen == 3){
            fmList[2] = this.Emisora_ActualFM;
        }
        if(option_chosen == 4){
            fmList[3] = this.Emisora_ActualFM;
        }
        if(option_chosen == 5){
            fmList[4] = this.Emisora_ActualFM;
        }
        if(option_chosen == 6){
            fmList[5] = this.Emisora_ActualFM;
        }
    }
    System.out.println("Se ha agregado la emisora a sus emisoras favoritas");
}
public void EscogerEmisoraFavorita(double[] amList,double[] fmList){
    int opcion_numerica=1;
    String emisora_escogida;
    int Emisora_Escogida_Integer;
    boolean entry_val;
    System.out.println("\n-------------------------------------------------");
    System.out.println("Estas son las emisoras guardadas en "+this.Modulacion);
    if(this.Modulacion == "AM"){
        for(int i=0;i<amList.length;i++){
            System.out.println("Opcion No."+opcion_numerica+": " +amList[i]);
            opcion_numerica++;
        }
    System.out.println("Escoja una emisora favorita guardada");
    do{
        emisora_escogida = scanner.nextLine();
        entry_val = manejadora.VerificarEntradaInt(emisora_escogida);
    }while(entry_val == false);
    Emisora_Escogida_Integer = Integer.parseInt(emisora_escogida);
    if(Emisora_Escogida_Integer == 1){
        this.Emisora_ActualAM = amList[0];
    }
    if(Emisora_Escogida_Integer == 2){
        this.Emisora_ActualAM = amList[1];
    }
    if(Emisora_Escogida_Integer == 3){
        this.Emisora_ActualAM = amList[2];
    }
    if(Emisora_Escogida_Integer == 4){
        this.Emisora_ActualAM = amList[3];
    }
    if(Emisora_Escogida_Integer == 5){
        this.Emisora_ActualAM = amList[4];
    }
    if(Emisora_Escogida_Integer == 6){
        this.Emisora_ActualAM = amList[5];
    }

    }else{
        for(int i = 0;i<fmList.length;i++){
            System.out.println("Opcion No."+opcion_numerica+": "+fmList[i]);
            opcion_numerica++;
        }
    System.out.println("Por favor, escoja una emisora favorita Guardada");
    do{
        emisora_escogida = scanner.nextLine();
        entry_val = manejadora.VerificarEntradaInt(emisora_escogida);
    }while(entry_val == false);
    Emisora_Escogida_Integer = Integer.parseInt(emisora_escogida);
    if(Emisora_Escogida_Integer == 1){
        this.Emisora_ActualFM = fmList[0];
    }
    if(Emisora_Escogida_Integer == 2){
        this.Emisora_ActualFM = fmList[1];
    }
    if(Emisora_Escogida_Integer == 3){
        this.Emisora_ActualFM = fmList[2];
    }
    if(Emisora_Escogida_Integer == 4){
        this.Emisora_ActualFM = fmList[3];
    }
    if(Emisora_Escogida_Integer == 5){
        this.Emisora_ActualFM = fmList[4];
    }
    if(Emisora_Escogida_Integer == 6){
        this.Emisora_ActualFM = fmList[5];
    }
    }
    System.out.println("Se ha escogido la emisora");
}
//emisora siguiente
@Override
public void nextStation(boolean frequency) {
    if(this.Modulacion == "AM"){
        this.Emisora_ActualAM = (this.Emisora_ActualAM + 10);
        if(this.Emisora_ActualAM >= 1610){
            this.Emisora_ActualAM = 530;
        }
    }
    else{
        double em_actual_fm = this.Emisora_ActualFM;
        em_actual_fm = em_actual_fm + 0.2;
        double emisora_un_decimal = new BigDecimal(em_actual_fm).setScale(1, RoundingMode.HALF_EVEN).doubleValue();
        this.Emisora_ActualFM = emisora_un_decimal;
        if(em_actual_fm >=107.9){
            this.Emisora_ActualFM = 87.9;
        }
    }
    
}

//emisora anterior
@Override
public void prevStation(boolean frequency) {
    if(this.Modulacion == "AM"){
        this.Emisora_ActualAM = (this.Emisora_ActualAM - 10);
        if(this.Emisora_ActualAM <= 530){
            this.Emisora_ActualAM = 530;
        }
    }
    else{
        double em_actual_fm = this.Emisora_ActualFM;
        em_actual_fm = em_actual_fm - 0.2;
        double emisora_un_decimal = new BigDecimal(em_actual_fm).setScale(1, RoundingMode.HALF_EVEN).doubleValue();
        this.Emisora_ActualFM = emisora_un_decimal;
        if(em_actual_fm <= 87.9){
            this.Emisora_ActualFM = 87.9;
        }
    }
    
}

@Override
public double getStation() {
    return 0;
}

@Override
public void saveStation(int position, double station) {
}

@Override
public double getSavedStation(int position) {
    return 0;
}

@Override
public boolean getFrequency() {
    return false;
}

//cambiar modulacion
@Override
public void switchAMFM() {
    if(this.Modulacion == "AM"){
        this.Modulacion = "FM";
    }else{
        this.Modulacion = "AM";
    }
    System.out.println("Se ha cambiado la modulacion. Usted esta escuchando ahora en "+getModulacion()); 
    }

}