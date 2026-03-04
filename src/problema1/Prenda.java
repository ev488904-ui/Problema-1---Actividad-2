package problema1;

import java.util.ArrayList;
import java.util.List;

public class Prenda {

    private String modelo;
    private String tela;
    private float costoProduccion;
    private String genero;
    private String temporada;
    private List<Lote> lotes;

    public Prenda(String modelo, String tela, float costoProduccion,
                  String genero, String temporada) {

        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccion = costoProduccion;
        this.genero = genero;
        this.temporada = temporada;
        this.lotes = new ArrayList<>();
    }

    public void agregarLote(Lote lote) {
        lotes.add(lote);
    }

    public List<Lote> obtenerLotes() {
        return lotes;
    }

    public float calcularPrecioVenta() {
        return costoProduccion * 1.15f;
    }

    public float getCostoProduccion() {
        return costoProduccion;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "\nTela: " + tela +
                "\nCosto Producción: $" + costoProduccion +
                "\nPrecio Venta: $" + calcularPrecioVenta() +
                "\nGenero: " + genero +
                "\nTemporada: " + temporada;
    }
}