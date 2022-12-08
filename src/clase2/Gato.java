package clase2;

public class Gato {
    /* Porpiedades o Caracteristicas*/
    private String nombre;
    private final String raza;
    private final String tipoPelaje;
    private byte edad;
    private int peso;
    private final int promedioVida;
    private final boolean tieneCola;

    /* Metodo constuctor*/
    public Gato(String nombre, String raza, int peso, int promedioVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.promedioVida = promedioVida;
        this.tipoPelaje = "normal";
        this.edad = 0;
        this.tieneCola = true;
    }

    /* Getters y Setters */
    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public byte getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getPromedioVida() {
        return promedioVida;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setNombre(String nombre) {
        if (this.edad < 2){
            this.nombre = nombre;
        }else{
            System.out.println("No le puedes cambiar el nombre");
        }
    }


    public void setEdad(int tiempo){
        this.edad += tiempo;
    }

    /* Acciones o Funcions */
    public void comer(int comida){
        if (comida > 2){
            this.peso++;
        }
    }

}
