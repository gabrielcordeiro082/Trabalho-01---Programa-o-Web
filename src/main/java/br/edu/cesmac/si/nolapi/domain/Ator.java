package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtor;
    private String nome;
    private String datanasc;
    private String sexo;
    private String biografia;

    public Ator(){

    }

    public Ator(Long idAtor, String nome, String datanasc, String sexo,String biografia){
        this.idAtor = idAtor;
        this.nome = nome;
        this.datanasc = datanasc;
        this.sexo = sexo;
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

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
