package proyecto;

import java.io.Serializable;

public class Paquetes implements Serializable {
    
    private String nick, ip, mensaje,nameA;
    private byte []archi;
    private int tam;
    private boolean texto,archivo;

    public String getNick() {
        return nick;
    }

    public String getIp() {
        return ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNameA() {
        return nameA;
    }

    public byte[] getArchi() {
        return archi;
    }

    public int getTam() {
        return tam;
    }

    public boolean isTexto() {
        return texto;
    }

    public boolean isArchivo() {
        return archivo;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public void setArchi(byte[] archi) {
        this.archi = archi;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setTexto(boolean texto) {
        this.texto = texto;
    }

    public void setArchivo(boolean archivo) {
        this.archivo = archivo;
    }

        
    

    
    
}
