package clase1;

import java.util.ArrayList;
import java.util.Scanner;
import clase2.Gato;

public class IntroJava {

    static String tablaDe(int number){
        String texto = "Tabla de " + number + ": \n";
        for (int i = 1; i <= 10; i++) {
            texto += number + " X " + i + " = " + (i * number) + "\n";
        }
        return texto;
    }

    public static void main(String[] args) {
        //Gato kali = new Gato("Kali", "Persa", 1, 14);
        //String texto = kali.nombre;
         //System.out.println("Hola Mundo");
        // tipos de datos
        // numeros
        byte numberSmall = 23;
        short numberShort = 3457;
        int number = 50, number2 = 90;
        long numberBig = 50L;
        float numberDecimal = 40.67f;
        double numberBigDecimal = 1234.28734d;
        // booleanos
        boolean isNumber = false;
        // texto
        char letra = 'r';
        String texto = "Hola Marco";
        /*
        System.out.println(number + number2);
        System.out.println(numberSmall);
        System.out.println(isNumber);
         */
        /* Entrada de datos */
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.print("Ingresa tu Nombre: ");
        String userName = entrada.nextLine();
        System.out.println("Hola " + userName);
         */
        // Condicionales
        //if
        /*
        System.out.print("Ingresa un Numero: ");
        int userNumber = entrada.nextInt();
         */
        /*
        if (userNumber > 0){
            System.out.println("Positivo");
        }else if(userNumber < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Cero");
        }
         */
        // switch
        /*
        switch (userNumber){
            case 1:
                System.out.println("uno");
                break;
            case -1:
                System.out.println("menos uno");
                break;
            case 0:
                System.out.println("cero");
                break;
            default:
                System.out.println("cualquier numero");
        }
         */
        // for
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(userNumber + " X " + i + " = " + (i * userNumber));
        }
         */
        // while
        /*
        int i = 1;
        while (i <= 10){
            System.out.println(userNumber + " X " + i + " = " + (i * userNumber));
            i++;
        }
        */
        // funciones
        /*
        System.out.println(tablaDe(userNumber));
         */
        /*
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
         */
        /*
        for (int n: numeros) {
            System.out.println(n);
        }
        int[] numeros2 = {1,2,34,8,57,8};
        for (int n: numeros2) {
            System.out.println(n);
        }
        */
        /*
        int[] numeros2 = {1,2,34,8,57,8};
        boolean is34 = Arrays.stream(numeros2).anyMatch( e -> e == 3);
        if (is34){
            System.out.println("El array contiene al 34");
        }else{
            System.out.println("El array no contiene al 34");
        }
        */
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(20);
        numeros.add(99);
        boolean isTrue = numeros.stream().anyMatch(numero -> numero == 20);
        String texto1 = isTrue ? "Yes" : "No";
        System.out.println(texto1);
    }
}

