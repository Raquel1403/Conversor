package com.example.agendav2.modelo;

import Modelo.ExcepcionMoneda;
import Modelo.MonedaVO;
import Modelo.repository.MonedaRepository;
import Modelo.repository.impl.MonedaRepositoryImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ConversorModelo implements MonedaRepository {

   private MonedaRepositoryImpl monedaRepository;

    public static void main(String[] args) {}

    public void recuperarMoneda(float multiplicador,  float cantidad){

    }

    @Override
    public ArrayList<MonedaVO> ObtenerListaMonedas() throws ExcepcionMoneda {
        return null;
    }

    @Override
    public void addMoneda(MonedaVO monedaVO) throws ExcepcionMoneda {
    }

    @Override
    public void deleteMoneda(Integer integer) throws ExcepcionMoneda {
    }

    @Override
    public void editMoneda(MonedaVO monedaVO) throws ExcepcionMoneda {
    }

    @Override
    public int lastId() throws ExcepcionMoneda {
        return 0;
    }
}
