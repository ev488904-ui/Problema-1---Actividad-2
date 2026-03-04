package problema1;

import java.time.LocalDate;

public class Lote {

    private int numeroLote;
    private int numeroPiezas;
    private LocalDate fechaFabricacion;
    private Prenda prenda;

    public Lote(int numeroLote, int numeroPiezas,
                LocalDate fechaFabricacion, Prenda prenda) {

        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;

        prenda.agregarLote(this);
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public float calcularCostoLote() {
        return numeroPiezas * prenda.getCostoProduccion();
    }

    public float calcularMontoRecuperacion() {
        float precioLotePorPieza = prenda.getCostoProduccion() * 1.05f;
        return numeroPiezas * precioLotePorPieza;
    }

    @Override
    public String toString() {
        return "Lote #" + numeroLote +
                " | Piezas: " + numeroPiezas +
                " | Fecha: " + fechaFabricacion +
                " | Costo: $" + calcularCostoLote() +
                " | Recuperación: $" + calcularMontoRecuperacion();
    }
}