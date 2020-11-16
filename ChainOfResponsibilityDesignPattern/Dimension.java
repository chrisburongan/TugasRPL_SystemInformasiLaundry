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
public class Dimension {
    private int [] coordinate;
    public Dimension (int x) {
        this.coordinate = new int[]{x};
    }

    public Dimension (int x, int y) {
        this.coordinate = new int[]{x,y};
    }
    public int [] getcoordinate(){
        return this.coordinate;
    }
}
