/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author De los angeles
 */
public class CuentaDTO {
   private String numero;
  private double saldo;

    public CuentaDTO(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
  
}
