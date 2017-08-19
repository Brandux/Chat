/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.Serializable;

/**
 *
 * @author Brandukosky
 */
public class Paquete implements Serializable{
    
    String IpOrigen;
    String IpDestino;
    String Usuario;
    String Mensaje;

    public Paquete(String IpOrigen, String IpDestino, String Usuario, String Mensaje) {
        this.IpOrigen = IpOrigen;
        this.IpDestino = IpDestino;
        this.Usuario = Usuario;
        this.Mensaje = Mensaje;
    }

    public Paquete() {
    }

    public String getIpOrigen() {
        return IpOrigen;
    }

    public void setIpOrigen(String IpOrigen) {
        this.IpOrigen = IpOrigen;
    }

    public String getIpDestino() {
        return IpDestino;
    }

    public void setIpDestino(String IpDestino) {
        this.IpDestino = IpDestino;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
}
