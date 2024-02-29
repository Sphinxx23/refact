/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraestatica2;

/**
 *
 * @author usuario
 */

public class Calculadora extends SuperClassMultiDiv implements InterfaceOperaciones {

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
    
    @Override
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    @Override
    public int restar(int restando1, int restando2) {
        return restando1 - restando2;
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