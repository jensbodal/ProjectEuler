package p18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author jensbodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * Date Day, Year Initials Completed v#
 */

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "p18/triangle.txt";
        TriangleArray triangle = new TriangleArray(path);
        System.out.println(
                triangle.totalMaxAdjacentValues(triangle.getTriangleArray()));
    }
}

