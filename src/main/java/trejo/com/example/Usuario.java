/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejo.com.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author publico
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    @Id
    @Column(name="idUsuario")
    @GeneratedValue(generator = "pkIdUsuario")
    @org.hibernate.annotations.GenericGenerator(
    name="pkIdUsuario",
    strategy = "increment")
    private Integer idUsuario;
    
    @Column(name="nombre")
    private String nombre;
    
   
    
    @OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE}) 
    private Direccion direccion;
    //mappedBy="usuario"
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Email> email = new ArrayList<Email>();
            
    public Usuario() {
    }

    public Usuario(Integer id) {
        this.idUsuario = id;
    }

    public Usuario(String nombre, Direccion direccion) {
        this.nombre = nombre;
       
        this.direccion = direccion;
    }
    

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getEmail() {
        return email;
    }

    public void setEmail(List email) {
        this.email = email;
    }
    public void addEmail(Email email){
        this.email.add(email);
    }


       
}
