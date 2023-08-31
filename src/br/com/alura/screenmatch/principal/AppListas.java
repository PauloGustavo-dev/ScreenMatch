package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class AppListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Serie serie = new Serie("La Casa de Papel", 2017);
        Filme outroFilme = new Filme("Oppenheimer", 2023);
        
        meuFilme.avalia(10);
        outroFilme.avalia(8);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(serie);

        for (Titulo item : listaDeFilmes) {
            System.out.println(item.getNome());
            try {
                Filme filme = (Filme) item;
                System.out.println(filme.getClassificacao());
            } catch (Exception e) {
                System.out.println("não e filme");
            }
            
            
        }
    }
}
