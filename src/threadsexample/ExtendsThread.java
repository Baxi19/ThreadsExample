/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexample;

/**
 *
 * @author Baxi
 */
public class ExtendsThread extends Thread {

    /**
     *
     */
    @Override
    public void run(){
       System.out.println("#2 Class extends Thread");
    }
  }
