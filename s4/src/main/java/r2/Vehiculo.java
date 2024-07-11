package r2;

import java.util.Arrays;

public class Vehiculo {
    private Llanta[] llantas = new Llanta[4];

    public Vehiculo() {
    }

    public Vehiculo(Combustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) obj;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(llantas, vehiculo.llantas)) return false;
        return combustible.equals(vehiculo.combustible);
    }

    private Combustible combustible = new Combustible();

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llanta delanteraIzquierda, Llanta delanteraDerecha, Llanta traseraIzquierda, Llanta traseraDerecha) {
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    public void llenaTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanza() {
        if (combustible.getLitrosActuales() > 0) {
            for (Llanta llanta : llantas) {
                llanta.rueda();
            }
            combustible.usa();
        } else {
            System.out.println("No hay combustible");
        }
    }
}