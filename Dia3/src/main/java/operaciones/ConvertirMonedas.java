package operaciones;

import java.math.BigDecimal;
import java.util.HashMap;

public class ConvertirMonedas {
    private float valorUsuario;
    private float valorCalculado;
    private String combinacionDeMonedas;
    private final HashMap<String,Float> relation = new HashMap<>();
    public ConvertirMonedas(){
        relation.put("MXNUSD", new Float(0.057232995));
        relation.put("MXNEUR", new Float(0.054064068));
        relation.put("MXNMXN", new Float(1));
        relation.put("USDMXN", new Float(17.472473));
        relation.put("USDEUR", new Float(0.94466491));
        relation.put("USDUSD", new Float(1));
        relation.put("EURMXN", new Float(18.496573));
        relation.put("EURUSD", new Float(1.0585764));
        relation.put("EUREUR", new Float(1));
    }
        public float convertirMoneda(){
        valorCalculado = relation.get(combinacionDeMonedas) * valorUsuario ;
        return  valorCalculado;
        }

    public void setValorUsuario(float valorUsuario) {
        this.valorUsuario = valorUsuario;
    }

    public void setCombinacionDeMonedas(String combinacionDeMonedas) {
        this.combinacionDeMonedas = combinacionDeMonedas;
    }

    public float getValorCalculado() {
        return valorCalculado;
    }
}
