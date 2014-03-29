package p18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        List<int[]> triListArray = triangle.getTriangleArray();
        Collections.reverse(triListArray);
        triListArray.stream().forEach((row) -> {
            System.out.println(Arrays.toString(row));
        });
    }
}

