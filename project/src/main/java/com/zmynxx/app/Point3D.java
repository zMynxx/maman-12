/**
* @repo https://github.com/zMynxx/maman-12
* @file Point3D.java
* @autor: Lior Dux
* @date: 2024-04-01
* @version: 1.1
* @description:
* Point3D class implementation
* _program calculates the area and the perimeter of a given triangle.
* The user is asked to enter the three lengths of the triangle's sides, if the sides are not positive integers the user will be asked to enter the sides again.
*/
import java.util.Scanner;

public class Point3D {
    private double x = 0;
    private double y = 0;
    private double z = 0;

    // Constructors
    public Point3D() {}
    public Point3D(double x, double y, double z) {
        _x = x;
        _y = y;
        _z = z;
    }

    public Point3D(Point3D other) {
        _x = other.x;
        _y = other.y;
        _z = other.z;
    }

    // Getters
    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public double getZ() {
        return _z;
    }

    // Setters
    public void setX(double x) {
        _x = x;
    }

    public void setY(double y) {
        _y = y;
    }

    public void setZ(double z) {
        _z = z;
    }

    public void setXYZ(double x, double y, double z) {
        _x = x;
        _y = y;
        _z = z;
    }

    // Print the point
    public String toString() {
        return "(" + _x + "," + _y + "," + _z + ")";
    }

    /*
     * @brief Check if given point is equal to this point. 
     * @param other Point3D object
     * @return boolean
     */
    public boolean equals(Point3D other) {
        return _x == other.x && _y == other.y && _z == other.z;
    }

    /*
     * @brief Check if given point is above this point.
     * @param other Point3D object
     * @return boolean
     */
    public boolean isAbove(Point3D other) {
        return _z > other.z;
    }

    /*
     * @brief Check if given point is above this point, aka this point is under the given point.
     * @param other Point3D object
     * @return boolean
     */
    public boolean isUnder(Point3D other) {
        return other.isAbove(this);
    }

    /*
     * @brief Check if given point is left to this point. 
     * @param other Point3D object
     * @return boolean
     */
    public boolean isLeft(Point3D other) {
        return _y < other.y;
    }

    /*
     * @brief Check if given point is left to this point, aka this point is right to the given point.
     * @param other Point3D object
     * @return boolean
     */
    public boolean isRight(Point3D other) {
        return other.isLeft(this);
    }

    /*
     * @brief Check if given point is behind this point.
     * @param other Point3D object
     * @return boolean
     */
    public boolean isBehind(Point3D other) {
        return _x < other.x;
    }

    /*
     * @brief Check if given point is in front of this point, aka this point is behind the given point. 
     * @param other Point3D object
     * @return boolean
     */
    public boolean isInFrontOf(Point3D other) {
        return other.isBehind(this);
    }

    /*
     * @brief Move the point by given delta values. 
     * @param dx double value to move the point on the x-axis
     * @param dy double value to move the point on the y-axis
     * @param dz double value to move the point on the z-axis
     * @return none
     */
    public void move(double dx, double dy, double dz) {
        _x += dx;
        _y += dy;
        _z += dz;
    }

    /*
     * @brief Calculate the distance between this point and another point. 
     * @param other Point3D object
     * @return double
     */
    public double distance(Point3D other) {
        return Math.sqrt(Math.pow(_x - other.x, 2) + Math.pow(_y - other.y, 2) + Math.pow(_z - other.z, 2));
    }
}
