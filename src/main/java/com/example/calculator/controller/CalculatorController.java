package com.example.calculator.controller;

import com.example.calculator.entity.Operation;
import com.example.calculator.service.CalculateService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnC;

    @FXML
    private Button btnDegree;

    @FXML
    private Button btnDevide;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnPoint;

    @FXML
    private Button btnResult;

    @FXML
    private Button btnSquareRoot;

    @FXML
    private TextField displayLabel;

    private CalculateService calculateService;

    @FXML
    public void initialize() {
        calculateService = new CalculateService(displayLabel);
        displayLabel.setText("0");
    }


    @FXML
    void btn0Action(ActionEvent event) {
        calculateService.pressNumber("0");
    }

    @FXML
    void btn1Action(ActionEvent event) {
        calculateService.pressNumber("1");
    }

    @FXML
    void btn2Action(ActionEvent event) {
        calculateService.pressNumber("2");
    }

    @FXML
    void btn3Action(ActionEvent event) {
        calculateService.pressNumber("3");
    }

    @FXML
    void btn4Action(ActionEvent event) {
        calculateService.pressNumber("4");
    }

    @FXML
    void btn5Action(ActionEvent event) {
        calculateService.pressNumber("5");
    }

    @FXML
    void btn6Action(ActionEvent event) {
        calculateService.pressNumber("6");
    }

    @FXML
    void btn7Action(ActionEvent event) {
        calculateService.pressNumber("7");
    }

    @FXML
    void btn8Action(ActionEvent event) {
        calculateService.pressNumber("8");
    }

    @FXML
    void btn9Action(ActionEvent event) {
        calculateService.pressNumber("9");
    }

    @FXML
    void btnCAction(ActionEvent event) {
        calculateService.pressReset();
    }

    @FXML
    void btnDegreeAction(ActionEvent event) {
        calculateService.pressOperation(Operation.DEGREE);
    }

    @FXML
    void btnDivideAction(ActionEvent event) {
        calculateService.pressOperation(Operation.DIVIDE);
    }

    @FXML
    void btnMinusAction(ActionEvent event) {
        calculateService.pressOperation(Operation.MINUS);

    }

    @FXML
    void btnMultiplyAction(ActionEvent event) {
        calculateService.pressOperation(Operation.MULTIPLY);

    }

    @FXML
    void btnPercentAction(ActionEvent event) {
        calculateService.pressOperation(Operation.PERCENT);

    }

    @FXML
    void btnPlusAction(ActionEvent event) {
        calculateService.pressOperation(Operation.PLUS);
    }

    @FXML
    void btnPointAction(ActionEvent event) {

        calculateService.pressPoint();
    }

    @FXML
    void btnResultAction(ActionEvent event) {
        calculateService.pressResult();
    }

    @FXML
    void btnSquareRootAction(ActionEvent event) {
        calculateService.pressOperation(Operation.ROOT);
    }

}
