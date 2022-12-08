package clase4;

public class Direccion {
    private final String calle;
    private final int numero;

    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getDirection(){
        return this.calle + this.numero;
    }
}
