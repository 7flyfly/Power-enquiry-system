package com.wf.json.pojo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class Add implements Serializable {
    @NotEmpty(message = "不能为空")
    @Digits(integer =1000,fraction = 2,message = "输入要为double类型")
    private double number1;
    @NotEmpty(message = "不能为空")
    @Digits(integer =1000,fraction = 2,message = "输入要为double类型")
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
