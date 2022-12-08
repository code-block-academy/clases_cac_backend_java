package clase2;

public class Run {
    public static void mostrarDatos(Gato[] gatos){
        for (Gato gato: gatos) {
            System.out.println("Nombre del Gato: " + gato.getNombre());
            System.out.println("Raza del Gato: " + gato.getRaza());
            System.out.println("Promedio de Vida del Gato: " + gato.getPromedioVida() + "\n");
        }
    }
}
