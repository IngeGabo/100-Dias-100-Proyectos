package operaciones;

public class ConvertirMonedas {
    private static final String[] combinaciones = {"MXNMXN", "MXNUSD", "MXNEUR", "USDMXN", "USDUSD", "USDEUR", "EURMXN", "EURUSD", "EUREUR"};
    private static final float[] miArreglo = {1.0f, 0.058f, 0.053f, 17.36f, 1.0f, 0.93f, 18.74f, 1.08f, 1.0f};
    //public static float convertir
    public static float convertirMoneda(String combinacion, float moneda){

        for (int i = 0;  i < 9; i++){
            if (combinacion.equals(combinaciones[i])) {
                System.out.println(miArreglo[i]);
                moneda = miArreglo[i]*moneda;
            }
        }
        return  moneda;
        }
}
