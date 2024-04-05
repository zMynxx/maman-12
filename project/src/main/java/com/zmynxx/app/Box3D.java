/**
* @repo https://github.com/zMynx/zMynxx/maman-12
* @file Box3D.java
* @autor: Lior Dulength
* @date: 2024-04-01
* @version: 1.1
* @description:
* Box3D class implementation
* Based on Point3D class implementation
* The program include different API methods to manipulate 3D boxes.
*/
import java.util.Scanner;

public class Box3D {
    private Point3D base = new Point3D(0.0, 0.0, 0.0);
    private double length = 1;
    private double width = 1;
    private double height = 1;

    // Constructors
    public Box3D() {}
    public Box3D(Point3D point, double length, double width, double height) {
        _base = new Point(point);
        _length = length;
        _width = width;
        _height = height;
    }

    public Box3D(Box3D other) {
        _base = new Point3D(other.point);
        _length = other.length;
        _width = other.width;
        _height = other.height;
    }

    // Getters
    public double getLength() {
        return _length;
    }

    public double getWidth() {
        return _width;
    }

    public double getHeight() {
        return _height;
    }

    public Point3D getBase() {
        return return new Point3D(_base);
    }

    // Setters
    public void setLength(double length) {
        _length = length;
    }

    public void setWidth(double width) {
        _width = width;
    }

    public void setHeight(double height) {
        _height = height;
    }

    public void setBase(Point3D p) {
        _base = new Point3D(p);
    }

    // Print the box
    public String toString() {
        return "The base point is" + _base.toString() + ", lenght = " + _length + ", width = " + _width + ", height = " + _height;
    }

    /*
     * @brief Check if given box is equal to this box. 
     * @param other Box3D object
     * @return boolean
     */
    public boolean equals(Box3D other) {
        return _base.equals(other.base) && _length == other.length && _width == other.width && _height == other.height;
    }

    /*
     * @brief Move the box given delta values. 
     * @param dLength double value to move the box on the length-alengthis
     * @param dWidth double value to move the box on the width-alengthis
     * @param dHeight double value to move the box on the height-alengthis
     * @return new Box3D object
     */
    public Box3D move(double dLength, double dWidth, double dHeight) {
        return new Box3D(_base.move(_length + dLength, _width + dWidth, _height + dHeight), _length, _width, _height);
    }


    /*
     * @brief Calculate the up right back point of the box. 
     * @return Point3D object
     */
    public Point3D getUpRightBackPoint() {
        return new Point3D(_base.move(_length, _width, _height));
    }

    /*
     * @brief Calculate the up right back point of the box. 
     * @return Point3D object
     */
    public Point3D getCenter() {
        return new Point3D(_base.move(_length / 2, _width / 2, _height / 2));
    }

    /*
     * @brief Calculate the distance between this box and another box. 
     * @param other Box3D object
     * @return double
     */
    public double distance(Box3D other) {
        return Math.sqrt(Math.pow(_length - other.length, 2) + Math.pow(_width - other.width, 2) + Math.pow(_height - other.height, 2));
    }

    /*
     * @brief Calculate the volume of the box. 
     * @return int
     */
    public int getVolume() {
        return _length * _width * _height;
    }

    /*
     * @brief Calculate the surface area of the box. 
     * @return int
     */
    public int getSufaceArea() {
        return 2 * (_length * _width + _length * _height + _width * _height);
    }

    /*
     * @brief Check if this box can contain the other box. 
     * @param other Box3D object
     * @return boolean
     */
    public boolean isLargerCapacity(Box3D other) {
        return getVolume() > other.getVolume();
    }

    /*
     * @brief Check if this box can contain the other box. 
     * @param other Box3D object
     * @return boolean
     */
    public boolean contains(Box3D other) {
        return _length > other.length && _width > other.width && _height > other.height;
    }

    /*
     * @brief Check if this box is above the other box. 
     * @param other Box3D object
     * @return boolean
     */
    public boolean isAbove(Box3D other) {
        return _base.isAbove(other.base);
    }
}
