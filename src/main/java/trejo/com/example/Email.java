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
import javax.persistence.Table;

/**
 *
 * @author publico
 */
@Entity
@Table(name="email")
public class Email implements Serializable{
    @Id
    @Column(name="idEmail")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEmail;
    
    @Column(name="email")
    private String email;
    /*
    @ManyToOne
    private Usuario usuario;
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
*/

    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    

    public Integer getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(Integer idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
       
    
}
