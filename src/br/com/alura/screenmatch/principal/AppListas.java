package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

            //maneira 1
            if (item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }
            //maneira 2
            try {
                Filme filme = (Filme) item;
                System.out.println(filme.getClassificacao());
            } catch (Exception e) {
                System.out.println("não e filme");
            } 
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Tom Holland");
        buscaPorArtista.add("Tom Cruise");
        
        Collections.sort(buscaPorArtista);
        System.out.println("Ordenado pelo sort: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("ordenando Filmes e series: ");
        for (Titulo i : lista){
        System.out.println( i.getNome());
        }

        System.out.println("Ordem alfabetica: " +lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento) );
        System.out.println("Ordem por ano: " + lista);
    }
}
