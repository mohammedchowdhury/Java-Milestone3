/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarLotServiceLayer;

/**
 *
 * @author mohammedchowdhury
 */
public class NoSuchCarException extends Exception {

    public NoSuchCarException(String message) {
        super(message);
    }

    public NoSuchCarException(String message,
            Throwable cause) {
        super(message, cause);
    }

}
