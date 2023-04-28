/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception2;

/**
 *
 * @author Student
 */
public class MyException extends Exception {
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg); // must call parents class
    }
}
