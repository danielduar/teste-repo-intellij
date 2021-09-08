package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato("Azul", "Alfredo", 10);

        Livro livro = new Livro("Ready Player 2", 15);

        System.out.println(gato);
        System.out.println(livro);

    }
}
