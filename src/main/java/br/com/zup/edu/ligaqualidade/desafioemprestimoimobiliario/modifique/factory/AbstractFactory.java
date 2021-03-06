package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.factory;

public interface AbstractFactory<T> {

	T create(String row);
}
