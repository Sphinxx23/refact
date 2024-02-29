/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraestatica2;

/**
 *
 * @author Vespertino
 */
public class SuperClassMultiDiv {
    
   
    public static int multiplicar(int operador1, int operador2) {
        return operador1 * operador2;
    }

    private static void validarDivisor(int valorCompr){
        if (valorCompr==0) {
            throw new ArithmeticException("Division por ceero");
        }
    }
    
    public static int dividir(int operador1, int operador2) {
        validarDivisor(operador2);
        return operador1 / operador2;
    }

    public static int modulo(int operador1, int operador2) {
        validarDivisor(operador2);
        return operador1 % operador2;
    }
    
}
