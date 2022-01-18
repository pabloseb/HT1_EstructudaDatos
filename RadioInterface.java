/**
 * @author Pablo Sebastian Herrera
 * @since 16/01/2022
 * @version 1.0
 * 
 * Interfaz para realizar metodos de la radio y conectar a otros grupos, esta clase es posible que sea modificada mas adelante para que se logre conectar con otros grupos 
 */
public interface RadioInterface {
    /**
     * cambiar estadio de la radio entre encendido y apagado
     */
    public void CambiarEstadoRadio();
    /**
     * cambiar la modulacion de la radio
     */
    public void CambiarModulacion();
    /**
     * avanzar a la siguiente emisora
     */
    public void EmisoraSiguiente();
    /**
     * retroceder a la emisora pasada
     */
    public void EmisoraPasada();
    /**
     * escoger emisoras favoritas dependiendo de la modulacion
     * @param amList lista para emisoras favoritas de AM
     * @param fmList lista para emisoras favoritas de FM
     */
    public void EscogerEmisoraFavorita(double[] amList, double[] fmList);
    /**
     * Editar las emisoras favoritas dependiendo de la modulacion
     * @param amList lista para emisoras favoritas de AM
     * @param fmList lista para emisoras favoritas de FM
     */
    public void EditarEmisorasFavorita(double[] amList, double[] fmList);
}
