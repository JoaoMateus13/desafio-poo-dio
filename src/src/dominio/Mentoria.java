package dominio;

import java.time.LocalDate;

public class Mentoria extends conteudo{
   private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcular_XP() {
        return 0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
