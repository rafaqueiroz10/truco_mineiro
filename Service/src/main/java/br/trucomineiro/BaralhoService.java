package br.trucomineiro;

import java.util.ArrayList;
import java.util.List;
import br.trucomineiro.Carta;

public class BaralhoService {
    private static final int NUMERO_MAXIMO_CARTAS;
    private List<Carta> cartas;

    static {
        NUMERO_MAXIMO_CARTAS = 40;
    }

    BaralhoService() {
        cartas = new ArrayList<>(NUMERO_MAXIMO_CARTAS);
    }

    public void addCarta(Carta carta) {
        if(cartas.size() == NUMERO_MAXIMO_CARTAS)
            return;

        cartas.add(carta);
    }
}
