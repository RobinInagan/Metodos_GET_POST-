/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.UsuariosDTO;

/**
 *
 * @author robin
 */
public class Usuario_DAO {

    public static List<UsuariosDTO> lista = new ArrayList<>();

    public Usuario_DAO() {
    }

    public void datos_pruebas() {
        UsuariosDTO User1 = new UsuariosDTO(0, "Pablo", "Pablo6@gmail.com", "828245", UsuariosDTO.ADMINISTRADOR);
        UsuariosDTO User2 = new UsuariosDTO(1, "Juan", "Juan6@gmail.com", "1234", UsuariosDTO.CLIENTE);
        UsuariosDTO User3 = new UsuariosDTO(2, "Pedro", "Pedro6@gmail.com", "1234", UsuariosDTO.VENDEDOR);
        lista.add(User1);
        lista.add(User2);
        lista.add(User3);
    }

    public boolean Crear(UsuariosDTO C) {
        if (C != null) {
            lista.add(C);
            return true;
        } else {
            return false;
        }
    }

    public List<UsuariosDTO> readAll() {
        List<UsuariosDTO> obj = null;
        obj = this.lista;
        return obj;
    }

}
