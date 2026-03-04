package problema1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Prenda camisa = new Prenda(
                "Camisa Formal",
                "Algodón",
                300.0f,
                "Masculino",
                "Invierno"
        );

        Lote lote1 = new Lote(1, 40, LocalDate.now(), camisa);
        Lote lote2 = new Lote(2, 25, LocalDate.now(), camisa);

        System.out.println("=== DATOS PRENDA ===");
        System.out.println(camisa);

        System.out.println("\n=== LOTES ===");
        for (Lote l : camisa.obtenerLotes()) {
            System.out.println(l);
        }
    }
}