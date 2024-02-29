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
    
    public int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        validarDivisor(b); 
        return a / b;
    }

    public static int modulo(int a, int b) {
        validarDivisor(b);
        return a % b;
    }
    
    private static void validarDivisor(int b){
        if (b==0) {
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
  

  public static int operacionObsoleta(int a, int b) {
        return a + b;
  }
}