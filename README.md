# Banco con DTO
### hicimos esta actividad para poder entender a trabajar con DTO

## Cliente
```java
package bancomacro;
public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String pass;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String apellido, String dni, String pass) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = pass;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
```
## ClienteDTO
```java
public class ClienteDTO {
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteDTO(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
```

## Cuenta
```java
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
}
```
## CuentaDTO
```java
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
```

## RespuestaDTO
```java
public class RespuestaDTO <T> {
    private boolean exito;
    private String mensaje;
    private T datos;

    public RespuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }
    
}
```
## main
```java
public class BancoMacro {

    public static ClienteDTO convertir(Cliente cli){
    return new ClienteDTO(cli.getNombre(), cli.getApellido(), cli.getDni());
    }
    public static CuentaDTO convertir2(Cuenta cuen){
    return new CuentaDTO(cuen.getNumero(), cuen.getSaldo());
    }
    public static void main(String[] args) {
       Cliente cliente=new Cliente(123, "nombre", "apellido", "dni", "pass");
       ClienteDTO cliDTO=convertir(cliente);
        System.out.println(cliDTO);
       Cuenta cuenta=new Cuenta(12, "383", 011444, "pass");
       CuentaDTO cuenDTO=convertir2(cuenta);
        System.out.println(cuenDTO);
        RespuestaDTO<ClienteDTO> respuesta=new RespuestaDTO<>(true,"encontrado",cliDTO);
        RespuestaDTO<CuentaDTO> respuesta2=new RespuestaDTO<>(true,"encontrado",cuenDTO);
    }
    
}
```
fin...