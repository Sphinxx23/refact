/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraestatica2;

/**
 *
 * @author usuario
 */

public class Calculadora {

    private int resultado;
   
    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public static int restar(int restando1, int restando2) {
        return restando1 - restando2;
    }

    public static int multiplicar(int operador1, int operador2) {
        return operador1 * operador2;
    }

    public static int dividir(int operador1, int operador2) {
        validarDivisor(operador2); 
        return operador1 / operador2;
    }

    public static int modulo(int operador1, int operador2) {
        validarDivisor(operador2);
        return operador1 % operador2;
    }
    
    private static void validarDivisor(int valorCompr){
        if (valorCompr==0) {
            throw new ArithmeticException("Division por ceero");
        }
    }
    
    public int operacion(int a, int b, String operacion) {
         switch (operacion) {
            case "sumar":
                return sumar(a, b);
            case "restar":
                return restar(a, b);
            case "multiplicar":
                return multiplicar(a, b);
            case "dividir":
                return dividir(a, b);
            case "modulo":
                return modulo(a, b);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
                
    }
  

}