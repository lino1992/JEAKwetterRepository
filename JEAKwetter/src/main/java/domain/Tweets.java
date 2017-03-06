/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author lino_
 */
@Entity
public class Tweets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=140) 
    private String tekst;
    private List<Profile> hearts;

    public Tweets(Long id, String tekst, List<Profile> hearts) {
        this.id = id;
        this.tekst = tekst;
        this.hearts = hearts;
    }
    
    public Tweets(){  
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public List<Profile> getHearts() {
        return hearts;
    }

    public void setHearts(List<Profile> hearts) {
        this.hearts = hearts;
    }
    
    
}
