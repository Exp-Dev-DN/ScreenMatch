package br.com.alura.projectzero__one.service;

public interface IConverteDados {

   <T> T obterDados(String json, Class<T> classe);
}
