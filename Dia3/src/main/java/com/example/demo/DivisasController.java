package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import operaciones.ConvertirMonedas;

import java.util.Scanner;


public class DivisasController {
    Scanner consola = new Scanner(System.in);
    ConvertirMonedas modelo;
    private String combinacion = "MXNMXN";
    @FXML
    private ComboBox<String> comboBoxMonedas;
    @FXML
    private ComboBox<String> comboBoxMonedasTwo;
    @FXML
    private TextField entrada;

    @FXML
    private TextField salida;

    @FXML
    private void initialize() {
        entrada.setText("0");
        comboBoxMonedas.getItems().addAll("MXN", "USD", "EUR");
        comboBoxMonedas.setValue("MXN"); // Valor por defecto
        comboBoxMonedasTwo.getItems().addAll("MXN", "USD", "EUR");
        comboBoxMonedasTwo.setValue("MXN"); // Valor por defecto
        modelo = new ConvertirMonedas();



    }
    @FXML
    private void convertir() {
        modelo.setCombinacionDeMonedas(comboBoxMonedas.getValue() + comboBoxMonedasTwo.getValue());
        try {
            modelo.setValorUsuario(Float.parseFloat(entrada.getText()));
        }catch (Exception e){
            limpiarTexto();
        }

        salida.setText(String.valueOf(modelo.convertirMoneda()));
    }


    @FXML
    private void limpiarTexto() {
        entrada.setText("0");
        salida.setText("");
    }


}