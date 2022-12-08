package clase3;

public class Animal {
    /* Porpiedades o Caracteristicas*/
    private String nombre;
    private String raza;
    private final String tipoPelaje;
    private int edad;
    private int peso;
    private int promedioVida;
    private final boolean tieneCola;
    private String voz;

    /* Constructores */
    public Animal(String nombre, String raza, String tipoPelaje, int edad, int peso, int promedioVida, boolean tieneCola, String voz) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipoPelaje = tipoPelaje;
        this.edad = edad;
        this.peso = peso;
        this.promedioVida = promedioVida;
        this.tieneCola = tieneCola;
        this.voz = voz;
    }

    /* Gettes y Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (this.edad < 2){
            this.nombre = nombre;
        }else{
            System.out.println("No le puedes cambiar el nombre");
        }
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (this.raza.isEmpty()){
            this.raza = raza;
        }
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(int promedioVida) {
        this.promedioVida = promedioVida;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void habla(){
        System.out.println(this.voz);
    }
}
