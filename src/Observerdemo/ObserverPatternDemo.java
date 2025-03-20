/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observerdemo;

/**
 *
 * @author GULE NARJIS
 */
public class ObserverPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new Octalobserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }

    }
    

