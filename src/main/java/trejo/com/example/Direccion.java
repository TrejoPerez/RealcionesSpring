/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejo.com.example;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author publico
 */
@Entity
@Table(name="direccion")
public class Direccion implements Serializable{
    @Id
    @Column(name="idDireccion")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer idDireccion;
    
    @Column(name="calle")
    private String calle;
    
    public Direccion() {
    }

    public Direccion(String calle) {
        this.calle = calle;
       
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

   

    
    
    

}
