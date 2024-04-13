
/**
 * La clase DataStructuresPrep está diseñada para reforzar conceptos
 * fundamentales de programación. A través de una serie
 * de métodos que implementan ejercicios prácticos, se puede
 * reforzar la comprensión de operaciones básicas como aritmética sin operadores
 * directos, verificación de números perfectos, cálculo de factoriales, entre
 * otros.
 * 
 * Estos ejercicios no solo mejoran la lógica de programación y la capacidad de
 * resolución de problemas de los estudiantes, sino que también les preparan
 * para enfrentar los desafíos más complejos que encontrarán en el curso de
 * Estructura de Datos. Al dominar estas habilidades fundamentales, los
 * estudiantes
 * estarán mejor equipados para comprender cómo operan internamente las
 * estructuras de datos y cómo pueden manipularlas eficientemente.
 */
public class DataStructuresPrep {

    /**
     * Resta dos números sin utilizar el operador de resta.
     * 
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return El resultado de restar b a a.
     *         Ejemplo: subtractAlgorithm(5, 3) retorna 2.
     */
    public int subtractAlgorithm(int a, int b) {
        int resultado = 0;
        while (a > (b + resultado)) {
            resultado = resultado + 1;
        }
        return resultado;

    }

    /**
     * Multiplica dos números sin utilizar el operador de multiplicación.
     * 
     * @param a El primer factor.
     * @param b El segundo factor.
     * @return El producto de a y b.
     *         Ejemplo: multiplyAlgorithm(5, 3) retorna 15.
     */
    public int multiplyAlgorithm(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;

    }

    /**
     * Divide dos números sin utilizar el operador de división.
     * 
     * @param dividend El dividendo.
     * @param divisor  El divisor.
     * @return El cociente de la división de dividend por divisor.
     *         Ejemplo: divideWAlgorithm(10, 2) retorna 5.
     */
    public int divideWAlgorithm(int dividend, int divisor) {
        int cont = 0;
        int residuo = dividend;
        while (residuo >= divisor) {
            cont++;
            residuo = residuo - divisor;

        }
        return cont;

    }

    /**
     * Verifica si un número es perfecto. Un número es perfecto si es igual a la
     * suma de sus divisores propios positivos, excluyéndose a sí mismo.
     * 
     * @param number El número a verificar.
     * @return Verdadero si el número es perfecto, falso en caso contrario.
     *         Ejemplo: isPerfectNumber(28) retorna true.
     */
    public boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a divisor and we start sum from 1
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) { // to avoid counting square root twice
                    sum += number / i;
                }
            }
        }

        return sum == number;

    }

    /**
     * Calcula el factorial de un número.
     * 
     * @param number El número.
     * @return El factorial de number.
     *         Ejemplo: getFactorial(5) retorna 120.
     */
    public int getFactorial(int number) {
        int cont = 1;
        for (int i = 2; i <= number; i++) {
            cont *= i;

        }
        return cont;

    }

    /**
     * Encuentra el número mayor en un arreglo de enteros.
     * 
     * @param numbers El arreglo de enteros.
     * @return El valor máximo en el arreglo.
     *         Ejemplo: findMaximum(new int[]{1, 5, 3, 6, 8, 2}) retorna 8.
     */
    public int findMaximum(int[] numbers) {
        int aux = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (aux < numbers[i]) {
                aux = numbers[i];
            }

        }
        return aux;

    }

    /**
     * Calcula la potencia de un número sin utilizar Math.pow.
     * 
     * @param base     La base.
     * @param exponent El exponente.
     * @return El resultado de elevar la base al exponente.
     *         Ejemplo: powerAlgorithm(2, 3) retorna 8.
     */
    public int powerAlgorithm(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int multi = 1;
        for (int i = 0; i < exponent; i++) {
            multi *= base;

        }
        return multi;
    }

    /**
     * Verifica si un número es primo.
     * 
     * @param number El número a verificar.
     * @return Verdadero si el número es primo, falso en caso contrario.
     *         Ejemplo: isPrime(5) retorna true.
     */
    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                // isPrime=false;
                return false;
            }
        }
        return isPrime;
    }

    /**
     * Cuenta cuántos dígitos tiene un número.
     * 
     * @param number El número.
     * @return La cantidad de dígitos en number.La cantidad de dígitos en number.
     *         Ejemplo: countDigits(12345) retorna 5.
     */
    public int countDigits(long number) {
        String salida = number + "";
        return salida.length();

    }

    public int findMaximum(int i, int j, int k, int l, int m, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMaximum'");
    }
}
