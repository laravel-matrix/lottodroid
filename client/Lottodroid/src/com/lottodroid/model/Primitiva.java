package com.lottodroid.model;

import java.util.Date;

/**
 * Results for a Primitiva draw
 */
public class Primitiva implements Lottery {
  private final Date date;
  private final int num1;
  private final int num2;
  private final int num3;
  private final int num4;
  private final int num5;
  private final int num6;
  private final int reintegro;
  private final int complementario;

  public Primitiva(Date date, int num1, int num2, int num3, int num4, int num5, int num6,
      int reintegro, int complementario) {
    this.date = date;
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
    this.num4 = num4;
    this.num5 = num5;
    this.num6 = num6;
    this.reintegro = reintegro;
    this.complementario = complementario;
  }

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }

  public int getNum3() {
    return num3;
  }

  public int getNum4() {
    return num4;
  }

  public int getNum5() {
    return num5;
  }

  public int getNum6() {
    return num6;
  }

  public int getReintegro() {
    return reintegro;
  }

  public int getComplementario() {
    return complementario;
  }

  @Override
  public Date getDate() {
    return date;
  }

  @Override
  public String getName() {
    return "Primitiva";
  }
}
