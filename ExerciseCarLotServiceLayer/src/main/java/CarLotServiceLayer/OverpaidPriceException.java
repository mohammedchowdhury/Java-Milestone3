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
public class OverpaidPriceException extends Exception {

    public OverpaidPriceException(String message) {
        super(message);
    }

    public OverpaidPriceException(String message,
            Throwable cause) {
        super(message, cause);
    }

}
