/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorators;

/**
 *
 * @author USER
 */

   abstract class decorator implements rectangleinterface {
    protected rectangleinterface decoratedRectangle;

    public decorator(rectangleinterface decoratedRectangle) {
        this.decoratedRectangle = decoratedRectangle;
    }
}
