package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilme;
    private String titulo;
    private String datalan;
    private String sinopse;

    public Filme() {

    }

    public Filme(Long idFilme, String titulo, String datalan, String sinopse) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.datalan = datalan;
        this.sinopse = sinopse;
    }

    public Long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Long idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatalan() {
        return datalan;
    }

    public void setDatalan(String datalan) {
        this.datalan = datalan;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}