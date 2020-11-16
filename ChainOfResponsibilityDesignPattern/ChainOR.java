/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityDesignPattern;

/**
 *
 * @author ASUS
 */
public interface ChainOR {
    public abstract void setNext(ChainOR nextInChainOR);
    public abstract void process (Dimension request);
}
