package clase2;

public class Main {
    public static void main(String[] args) {
        String nombre = "marco";

        Gato persa = new Gato("Sarita", "Persa", 1, 14);
        Gato ragdoll = new Gato("Felipe", "Ragdoll", 1, 20);
        Gato siames = new Gato("Kiwi", "Siames", 1, 10);
        Gato[] gatos = {persa, ragdoll, siames};

        Run.mostrarDatos(gatos);

        persa.setEdad(3);
        persa.setNombre("Kale");

        Run.mostrarDatos(gatos);
    }
}
