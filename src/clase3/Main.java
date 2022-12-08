package clase3;

public class Main {
    public static void main(String[] args) {
        String nombre = "marco";
        /*
        Gato persa = new Gato("Sarita", "Persa", 1, 14);
        Gato ragdoll = new Gato("Felipe", "Ragdoll", 1, 20);
        Gato siames = new Gato("Kiwi", "Siames", 1, 10);
        Gato[] gatos = {persa, ragdoll, siames};
        Gato nuevo = new Gato("kity");
        Perro perro  = new Perro("Simba", "wua!!");
        // Gato kiwi = new Perro("furulai", "grrr!!");
        Gato kiwi = new Gato("furulai");

        persa.comer(3);
        perro.comer(5);
        System.out.println(perro.getLadrar());
        //Run.mostrarDatos(gatos);


        Run.suma(54);

        Run.suma(45, 89);

        persa.setNombre("Kale");

        //Run.mostrarDatos(gatos);
        */
        Gato persa = new Gato("Sarita", "Persa");
        Gato ragdoll = new Gato("Felipe", "Ragdoll");
        Gato siames = new Gato("Kiwi", "Siames");
        Perro perro1 = new Perro("Sarita", "Persa");
        Perro perro2 = new Perro("Felipe", "Ragdoll");
        Perro perro3 = new Perro("Kiwi", "Siames");
        persa.habla();
        perro1.habla();

    }
}
