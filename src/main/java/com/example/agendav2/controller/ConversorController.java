package com.example.agendav2.controller;

import com.example.agendav2.Main;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConversorController{

    @FXML
    TextField cantidad;
    @FXML
    TextField cambio;

    @FXML
    Main mainApp;

public void ponerContador(){
    int nuevoValor = Integer.parseInt(cantidad.getText());
  /* numPulsaciones.set(nuevoValor);
    setContador();*/
}

public float getCantidad(){
    float cantidad = Float.parseFloat(this.cantidad.getText());
    return cantidad;
}

}
