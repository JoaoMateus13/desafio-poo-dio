package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {


    private String name;

    private String descricao;

    private LocalDate dateInicial = LocalDate.now();


    private LocalDate dateFinal = dateInicial.plusDays(45);


    private Set<Dev> devesInscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDateInicial() {
        return dateInicial;
    }

    public void setDateInicial(LocalDate dateInicial) {
        this.dateInicial = dateInicial;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(LocalDate dateFinal) {
        this.dateFinal = dateFinal;
    }

    public Set<Dev> getDevesInscritos() {
        return devesInscritos;
    }

    public void setDevesInscritos(Set<Dev> devesInscritos) {
        this.devesInscritos = devesInscritos;
    }

    public Set<conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name)
                && Objects.equals(descricao, bootcamp.descricao)
                && Objects.equals(dateInicial, bootcamp.dateInicial)
                && Objects.equals(dateFinal, bootcamp.dateFinal)
                && Objects.equals(devesInscritos, bootcamp.devesInscritos)
                && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descricao, dateInicial, dateFinal, devesInscritos, conteudos);
    }
}
