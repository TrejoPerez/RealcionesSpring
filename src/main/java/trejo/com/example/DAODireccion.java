/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejo.com.example;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author publico
 */
public interface DAODireccion extends CrudRepository<Direccion, Integer>{
    
}
