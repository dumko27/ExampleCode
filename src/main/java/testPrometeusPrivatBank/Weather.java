/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPrometeusPrivatBank;

/**
 *
 * @author Novikov Dmitry
 */
public class Weather {
  public static void main(String[] args) {
    Forecaster fc = new Forecaster();
    new Listener(fc);
    new Listener(fc);
    new Listener(fc);
  }
  static class Forecaster extends Thread {
    private int tomorrowsTemperature;
    public Forecaster() {
      start();
    }
    public synchronized int getTomorrowsTemperature() {
      return tomorrowsTemperature;
    }
    public void run() {
      try {
        for (;;) {
          // make a careful, precise, scientific estimate
          // of what the temperature will be tomorrow:
          sleep(1000);
          synchronized (this) {
            tomorrowsTemperature = (int) (40 * Math.random() - 10);
            notifyAll();
          }
        }
      } catch (Exception e) { throw new RuntimeException(e); }
    }
  }
  static class Listener extends Thread {
    private final Forecaster forecaster;
    public Listener(Forecaster forecaster) {
       this.forecaster = forecaster;
       start();
    }
    public void run() {
      try {
        for (;;) {
          synchronized (forecaster) { forecaster.wait(); }
          System.out.println("I hear tomorrow's temperature will be "
                            + forecaster.getTomorrowsTemperature()
                            + " degrees Celsius");
        }
      } catch (Exception e) { throw new RuntimeException(e); }
    }
  }
}

// Ответ B: Каждую секунду , все три