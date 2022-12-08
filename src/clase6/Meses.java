package clase6;

public enum Meses {
    ENERO(1, "ENE"), FEBRERO(2, "FEB"), MARZO(3, "MAR"), ABRIL(4, "ABR");
    /*
    MAYO, JUNIO,
    JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE,
    NOVIEMBRE, DICIEMBRE;
    */

    private final int numero;
    private final String abreviatura;

    Meses(int numero, String abreviatura){
        this.numero = numero;
        this.abreviatura = abreviatura;
    }

    public int getNumero() {
        return numero;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
