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

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Point3DTest {
    @Test
    public static vid testPoint3DTest_EmptyConstructor() {
        Point3D point = new Point3D();
        assertEquals(0, point.getX(), 0.001);
        assertEquals(0, point.getY(), 0.001);
        assertEquals(0, point.getZ(), 0.001);
    }

    @Test
    public static void testPoint3DTest_ValidInput() {
        // Define input for a valid triangle
        String input = "3\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output to capture console print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute main method
        Triangle.main(new String[0]);

        // Restore original System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Assert output
        String expectedOutput = "This program calculates the area and the perimeter of a given triangle. \n" +
                                "Please enter the three lengths of the triangle's sides\n" +
                                "The lengths of the triangle sides are: 3, 4, 5\n" +
                                "The perimeter of the triangle is: 12\n" +
                                "The area of the triangle is: 6.0\n";
        assertEquals(expectedOutput, outContent.toString()
    }
}
