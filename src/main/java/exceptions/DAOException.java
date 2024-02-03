/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author AF
 */
public class DAOException extends Exception{
    public DAOException(Throwable cause){
        super(cause);
    }
    public DAOException (String message, Throwable cause){
        super(message, cause);
    }
}
 