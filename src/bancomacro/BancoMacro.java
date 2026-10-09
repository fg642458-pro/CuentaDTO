/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomacro;

/**
 *
 * @author De los angeles
 */
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
