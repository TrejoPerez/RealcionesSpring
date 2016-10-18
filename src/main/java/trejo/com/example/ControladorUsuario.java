/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejo.com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author publico
 */
@RequestMapping("/")
@RestController
public class ControladorUsuario {
    @Autowired
    DAOUsuario daoUsuario;
    @Autowired
    DAODireccion daoDireccion;
    @RequestMapping(value = "save/{nombre}/{calle}/{email}",method=RequestMethod.GET)
    public String saveUser(@PathVariable String nombre,@PathVariable String calle,
            @PathVariable String email){
        
        Direccion d = new Direccion(calle);
        Usuario u = new Usuario(nombre, d);
        Email e = new Email(email);
        u.addEmail(e);
        //e.setUsuario(u);
        //daoDireccion.save(d);
        daoUsuario.save(u);
        return "Usuario guardadop";
    }
    
    @RequestMapping(value="delete/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable Integer id){
        daoUsuario.delete(id);
        return "Borrado";
    }
    
    @RequestMapping(value="find/{id}", method=RequestMethod.GET)
    public Usuario find(@PathVariable Integer id) throws JsonProcessingException{
        Usuario u = daoUsuario.findOne(id);

        
        ObjectMapper mapper = new ObjectMapper();
        return u;
    }
    
    @RequestMapping(value="findAll/", method=RequestMethod.GET)
    public ArrayList<Usuario> findAll() throws JsonProcessingException{
        ArrayList<Usuario> u = (ArrayList<Usuario>) daoUsuario.findAll();

        
        ObjectMapper mapper = new ObjectMapper();
        return u;
    }
}
