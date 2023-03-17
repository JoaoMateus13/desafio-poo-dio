package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {


    private String name;

    private String descricao;

    private LocalDate dateInicial = LocalDate.now();


    private LocalDate dateFinal = dateInicial.plusDays(45);


    private Set<Dev> devesInscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();




}
