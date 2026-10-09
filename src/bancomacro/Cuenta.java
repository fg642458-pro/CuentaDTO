/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author De los angeles
 */
public class Cuenta {
  private int id_cuenta;
  private String numero;
  private double saldo;
  private String pass;

    public Cuenta() {
    }

    public Cuenta(int id_cuenta, String numero, double saldo, String pass) {
        this.id_cuenta = id_cuenta;
        this.numero = numero;
        this.saldo = saldo;
        this.pass = pass;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id_cuenta=" + id_cuenta + ", numero=" + numero + ", saldo=" + saldo + ", pass=" + pass + '}';
    }
  
}
