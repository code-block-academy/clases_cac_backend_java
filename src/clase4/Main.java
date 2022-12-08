package clase4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2000, 2, 3);
        Direccion direccion = new Direccion("calle falsa", 123);
        Usuario user1 = new Usuario("marco", "avila", fecha, direccion, "racnar1", "corre@asd", "asdgg");
        Usuario user2 = new Usuario("dfguyu", "qwehdfh", fecha, direccion, "cxvbfj", "qwer@asd", "qwer");
        Docente docente = new Docente("marco", "avila", fecha, direccion);
        ArrayList<Persona> asistentes = null;
        asistentes.add(user1);
        asistentes.add(user2);
        asistentes.add(docente);
    }
}
