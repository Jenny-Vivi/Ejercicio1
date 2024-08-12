public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear una instancia de la clase Repaso.
         * 
         * Una 'instancia' es un objeto concreto creado a partir de una clase.
         * En este caso, estamos creando un nuevo objeto llamado 'dataStructuresPrep' a
         * partir
         * de la clase 'Repaso'. Cada instancia de una clase tiene sus propios
         * atributos y métodos, lo que significa que podemos usar 'dataStructuresPrep'
         * para
         * acceder a los métodos definidos dentro de la clase 'Repaso'.
         */
        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        /*
         * Usar la instancia 'dataStructuresPrep' para llamar al método
         * 'subtractWithoutSubtracting'.
         * 
         * Ahora que tenemos una instancia de 'Repaso', podemos usarla para llamar a sus
         * métodos.
         * Aquí, llamamos al método 'subtractWithoutSubtracting', pasando 15 y 5 como
         * argumentos.
         * Este método está diseñado para restar el segundo número del primero sin usar
         * el
         * operador de resta tradicional. Es un buen ejercicio para entender cómo
         * podemos
         * realizar operaciones básicas de manera creativa en programación.
         */
        boolean numeroPerfecto = dataStructuresPrep.isPerfectNumber(6);
        int resultado = dataStructuresPrep.subtractAlgorithm(10, 5);
        int resultadoMultiplicacion = dataStructuresPrep.multiplyAlgorithm(5, 5);
        int resultadoDivison = dataStructuresPrep.divideWAlgorithm(10, 2);
        int factorial = dataStructuresPrep.getFactorial(5);
        int algoritmo = dataStructuresPrep.powerAlgorithm(2, 3);
        boolean esprime = dataStructuresPrep.isPrime(10);
        System.out.println("El numero :" + esprime);
        if (esprime) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

        int numeros = dataStructuresPrep.countDigits(1235l);
        int[] numerosmax = { 3, 5, 3, 6, 8, 2 };
        int mayor = dataStructuresPrep.findMaximum(numerosmax);
        /*
         * Imprimir el resultado de la operación.
         * 
         * Finalmente, imprimimos el resultado de la operación a la consola. Esto nos
         * permite
         * ver el resultado de nuestro método 'subtractWithoutSubtracting'. En este
         * ejemplo,
         * estamos esperando que el resultado sea 10, ya que 15 menos 5 es igual a 10.
         * Esta línea demuestra cómo podemos interactuar con los métodos de nuestras
         * instancias
         * y usar los resultados de sus operaciones en otras partes de nuestro código,
         * como
         * parte de mensajes de salida o en lógicas de decisión más complejas.
         */
        System.out.println("El resultado de restar 15 - 5 sin usar el operador de resta es: " + resultado);

        System.out.println("El resultado de multiplicar  15 * 5 sin usar el operador de la multiplicacion es: "
                + resultadoMultiplicacion);
        System.out.println("El resultado de dividir  15 / 5 sin usar el operador de divisor  es: "
                + resultadoDivison);
        System.out.println("El resultado de factorial " + factorial);
        System.out.println("El algoritmo es : " + algoritmo);
        System.out.println("La cantidad de dígitos en number. " + numeros);
        System.out.println("El mayor es :" + mayor);
        System.out.println("El numero es " + numeroPerfecto);

    }
}
