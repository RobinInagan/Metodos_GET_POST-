/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.Contacto_DTO;

/**
 *
 * @author robin
 */
public class Contacto_DAO {
    public static List<Contacto_DTO> lista = new ArrayList<>();

    public Contacto_DAO() {
    }
    
    public boolean Crear (Contacto_DTO C){
        if(C!= null){
            lista.add(C);
            return true;
        }else{
         return false;   
        }
    }
    public List<Contacto_DTO> readAll(){
        List<Contacto_DTO> obj = null;
        obj = this.lista;
        return obj;
    }
}