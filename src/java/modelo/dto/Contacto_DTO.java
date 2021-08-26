/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.util.Objects;

/**
 *
 * @author robin
 */
public class Contacto_DTO {
    private String Nombre,Correo,Asunto,Comentario;

    public Contacto_DTO() {
    }

    public Contacto_DTO(String Nombre, String Correo, String Asunto, String Comentario) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Asunto = Asunto;
        this.Comentario = Comentario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + " , Asunto=" + Asunto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto_DTO other = (Contacto_DTO) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        if (!Objects.equals(this.Asunto, other.Asunto)) {
            return false;
        }
        if (!Objects.equals(this.Comentario, other.Comentario)) {
            return false;
        }
        return true;
    }
    
    
}
