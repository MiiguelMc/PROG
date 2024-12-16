package utilidades;

public class CalculadorPuntacion {
    /**
     * @author Miguel Macias del Pino
     * @param carta
     * @param dado
     * @return
     * @Note
     *       AQUI TENEMOS LA CALCULADORA DE PUNTUACION LA CUAL SUMA CARTA Y DADOS
     *       Y A ESE RESULTADO LE SUMA LA BONIFICACION O LE DA LA PENALIZACION
     */
    public static double CalculadoradePuntacion(int carta, int dado) {
        double puntuacion = 0;
        if (carta % 2 == 0) {
            puntuacion = (dado + carta) + (carta * 0.1);
        } else if (carta % 2 != 0) {
            puntuacion = (dado + carta) - (carta * 0.05);
        }
        return puntuacion;
    }
}
