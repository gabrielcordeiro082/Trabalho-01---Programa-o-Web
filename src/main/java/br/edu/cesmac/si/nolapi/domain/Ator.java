package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtor;
    private String nome;
    private String email;
    private String biografia;

    public Ator(){

    }

    public Ator(Long idAtor, String nome, String email, String biografia){
        this.idAtor = idAtor;
        this.nome = nome;
        this.email = email;
        this.biografia = biografia;
    }

    public Long getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(Long idAtor) {
        this.idAtor = idAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
