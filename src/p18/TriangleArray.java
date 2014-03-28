package p18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jensbodal
 * @version 1.0
 *
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 *
 * Date Day, Year Initials Completed v#
 */
public class TriangleArray {
    // Final Variables

    // Private Class Variables
    private File file;
    private List<int[]> triangleArray;

    public TriangleArray(String filePath) throws FileNotFoundException {
        setFile(filePath);
        createTriangleArray(getFile());
    }

    private void setFile(String filePath) throws FileNotFoundException {
        file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
    }

    private File getFile() {
        return this.file;
    }

    private void createTriangleArray(File file) throws FileNotFoundException {
        triangleArray = new ArrayList<>();
        String line;
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(" ");
                int[] items = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    items[i] = Integer.valueOf(tokens[i]);
                }
                triangleArray.add(items);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public List<int[]> getTriangleArray() {
        return this.triangleArray;
    }

    public int maxPerLineTotal(List<int[]> triangle) {
        List<Integer> maxValueList = new ArrayList<>();
        for (int[] row : triangle) {
            int max = 0;
            for (int i : row) {
                if (max < i) {
                    max = i;
                }
            }
            maxValueList.add(max);
        }
        int sum = 0;
        for (int value : maxValueList) {
            sum = sum + value;
        }
        return sum;
    }

    public int totalMaxAdjacentValues(List<int[]> triangle) {
        Collections.reverse(triangle);
        List<Integer> maxValueList = new ArrayList<>();
        int index = 0;
        for (int[] row : triangle) {
            int max = 0;
            int middle = (index);
            int right = (index + 1);
            if (max < row[middle]) {
                index = middle;
                max = row[middle];
            }
            if (right <= row.length-1) {
                if (max < row[right]) {
                    index = right;
                    max = row[right];
                }
            }
            System.out.println(index + " : " + max);
            maxValueList.add(max);
        }
        int sum = 0;
        for (int value : maxValueList) {
            sum = sum + value;
        }
        return sum;
    }

}
