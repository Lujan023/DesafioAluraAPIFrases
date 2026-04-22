package com.example.DesafioAluraAPIScreenmatch.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
