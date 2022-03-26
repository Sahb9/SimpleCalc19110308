package com.android.simplecalc;

import android.util.Log;
import android.widget.Toast;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL,Exponential,Factorial,Logarit}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
   /***  Exponential*/
    public double Exponential(double firstOperand, double secondOperand) {

        return Math.pow(firstOperand, secondOperand);
    }
    /***  Giai thừa*/
    public double Factorial(double firstOperand, double secondOperand) {
        double score=1;
        try
        {
            if(firstOperand<0)
            {
                return Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY;
            }
                for(double i=1;i<=firstOperand;i++)
                {
                    score*=i;
                }
        }
        catch (NumberFormatException e)
        {
            Log.e("Factorial",e.getMessage());
        }

        return score;
    }
     /***  Logarit*/
    public double Logarit(double firstOperand, double secondOperand) {
        return customLog(firstOperand,secondOperand);
    }
    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

}
