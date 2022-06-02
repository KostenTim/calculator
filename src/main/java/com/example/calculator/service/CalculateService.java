package com.example.calculator.service;

import com.example.calculator.entity.Operation;
import javafx.scene.control.TextField;

public class CalculateService {

    private TextField displayLabel;

    private String displayText;
    private boolean inputFirstNumber;
    private String firstNumber;
    private String secondNumber;
    private Operation lastOperation;
    private Operation operation;
    private double result;

    public CalculateService(TextField displayLabel) {
        this.displayLabel = displayLabel;
        displayText = "0";
        firstNumber = null;
        secondNumber = null;
        lastOperation = Operation.NULL;
        operation = Operation.NULL;
        inputFirstNumber = true;
    }

    public void changeDisplay(String text){
        displayText = text;
        displayLabel.setText(text);
    }

    public void pressNumber(String num){
        if(inputFirstNumber){
            if(firstNumber == null){
                firstNumber = "";
            }
            firstNumber+=num;
            changeDisplay(firstNumber);
        }else{
            if(secondNumber == null){
                secondNumber = "";
            }
            secondNumber+=num;
            changeDisplay(secondNumber);
        }
    }

    public void pressPoint(){
        if(inputFirstNumber){
            if(firstNumber == null){
                firstNumber = "0.";
            }else{
                if(!firstNumber.contains(".")){
                    firstNumber+=".";
                }else{
                    return;
                }
            }
            changeDisplay(firstNumber);
        }else{
            if(secondNumber == null){
                secondNumber = "0.";
            }else{
                if(!secondNumber.contains(".")){
                    secondNumber+=".";
                }else{
                    return;
                }
            }
            changeDisplay(secondNumber);
        }
    }

    public void pressReset(){
        displayText = "0";
        firstNumber = null;
        secondNumber = null;
        lastOperation = Operation.NULL;
        operation = Operation.NULL;
        inputFirstNumber = true;
        changeDisplay(displayText);
    }

    public void pressResult(){
        if(operation == Operation.NULL){
            return;
        }
        if(operation == Operation.PLUS){
            if(secondNumber == null){
                return;
            }else{
                result = Double.valueOf(firstNumber) +  Double.valueOf(secondNumber);
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
        if(operation == Operation.MINUS){
            if(secondNumber == null){
                return;
            }else{
                result = Double.valueOf(firstNumber) -  Double.valueOf(secondNumber);
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
        if(operation == Operation.DIVIDE){
            if(secondNumber == null){
                return;
            }else{
                result = Double.valueOf(firstNumber) /  Double.valueOf(secondNumber);
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
        if(operation == Operation.MULTIPLY){
            if(secondNumber == null){
                return;
            }else{
                result = Double.valueOf(firstNumber) *  Double.valueOf(secondNumber);
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
        if(operation == Operation.PERCENT){
            if(secondNumber == null){
                return;
            }else{
                result = Double.valueOf(firstNumber)/100 *  Double.valueOf(secondNumber);
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
        if(operation == Operation.DEGREE){
            if(secondNumber == null){
                return;
            }else{
                result = Math.pow(Double.valueOf(firstNumber),Double.valueOf(secondNumber));
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
            }
        }
    }

    public void pressOperation(Operation operation){
        if(operation == Operation.ROOT){
            if(secondNumber !=null){
                return;
            }else{
                result =Math.pow(Double.valueOf(firstNumber), 0.5) ;
                firstNumber = String.valueOf(result);
                changeDisplay(firstNumber);
                lastOperation = operation;
                operation = Operation.NULL;
                secondNumber = null;
                return;
            }
        }
        if(firstNumber == null){
            if(operation == Operation.MINUS){
                firstNumber = "-";
                changeDisplay("-");
                return;
            }else{
                return;
            }
        }
        if(secondNumber == null){

            inputFirstNumber = false;
            this.operation = operation;
            changeDisplay("0");
            return;
        }
        if(operation != Operation.NULL){
            pressResult();
            this.operation = operation;
        }
    }
}
