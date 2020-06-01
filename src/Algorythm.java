import java.io.*;
import java.nio.charset.StandardCharsets;

public class Algorythm
{
    public static boolean isCellValid(String array)
    {
        for (int i=0; i<array.length(); i++)
        {
            if(array.charAt(i) != '0' && array.charAt(i) != '1' && array.charAt(i) != '2' && array.charAt(i) != '3')
                return false;
        }
        return true;
    }

    public void gridChanger(int numberOfIt, String inputPath, String outputPath ) throws IOException {

        File inputFile = new File(inputPath);
        if(!inputFile.exists())
        {
            System.out.println("Unable to locate \"" + inputPath + "\"");
            return;
        }


        Grid grid = new Grid();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.US_ASCII));
        String currentLine = reader.readLine();
        grid.colSize = currentLine.length();
        grid.rowSize = 1;
        while ((currentLine = reader.readLine()) != null) //Determining the size of the board from input file
        {
            for (int currentCol = 0; currentCol < currentLine.length(); currentCol++)
            {
                int currentSize = currentLine.length();
                if (currentCol != 0 && currentSize != grid.colSize)
                {
                    System.out.print("Lengths of rows don't match up, all rows must be the same length!");
                    return;
                }
                if(!isCellValid(currentLine))
                {
                    System.out.println("Invalid value found the current row, only specified digits are accepted!");
                    return;
                }
            }
            grid.rowSize++;
        }
        int [][] gridArray = grid.GetGridArray(grid.colSize, grid.rowSize);
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.US_ASCII));
        int currentRow = 0;
        while ((currentLine = reader.readLine()) != null) //Inserting data from input file to board
        {
            for (int currentCol = 0; currentCol < currentLine.length(); currentCol++)
            {
                gridArray[currentCol][currentRow] = Character.getNumericValue(currentLine.charAt(currentCol));
            }
            currentRow++;
        }
        reader.close();
        System.out.println("Starting state of the board:");
        PngMaker png = new PngMaker();
        Grid.PrintGrid(gridArray);
        png.draw(grid.rowSize,grid.colSize,gridArray, outputPath, 1);
        System.out.println("\n-----------\nIterations: ");
        for(int i=0; i<numberOfIt; i++) //Loop with iterations
        {
            Grid.ChangeAllCells(gridArray); //Modifies states of all cells once
            System.out.println();
            png.draw(grid.rowSize,grid.colSize,gridArray, outputPath, i+2);
            Grid.PrintGrid(gridArray);
        }
    }

/*    public static void main(String[] args) throws IOException
    {

        try //Check if string args[0] is numeric
       {
            Integer.parseInt(args[0]);
        }
        catch (Exception e)
        {
            System.out.println("Invalid argument!\nThe number of iterations must be an integer!");
            return;
        }
        if(Integer.parseInt(args[0]) <= 0) //After changing string args[0] to integer check if it's positive
        {
            System.out.println("Invalid argument!\nThe number of iterations must be larger than 0!");
        }
        File inputFile = new File(args[1]);
        if(!inputFile.exists())
        {
            System.out.println("Unable to locate \"" + args[1] + "\"");
            return;
        }


        Grid grid = new Grid();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.US_ASCII));
        String currentLine = reader.readLine();
        grid.colSize = currentLine.length();
        grid.rowSize = 1;
        while ((currentLine = reader.readLine()) != null) //Determining the size of the board from input file
        {
            for (int currentCol = 0; currentCol < currentLine.length(); currentCol++)
            {
                int currentSize = currentLine.length();
                if (currentCol != 0 && currentSize != grid.colSize)
                {
                    System.out.print("Lengths of rows don't match up, all rows must be the same length!");
                    return;
                }
                if(!isCellValid(currentLine))
                {
                    System.out.println("Invalid value found the current row, only specified digits are accepted!");
                    return;
                }
            }
            grid.rowSize++;
        }
        int [][] gridArray = grid.GetGridArray(grid.colSize, grid.rowSize);
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.US_ASCII));
        int currentRow = 0;
        while ((currentLine = reader.readLine()) != null) //Inserting data from input file to board
        {
            for (int currentCol = 0; currentCol < currentLine.length(); currentCol++)
            {
                gridArray[currentCol][currentRow] = Character.getNumericValue(currentLine.charAt(currentCol));
            }
            currentRow++;
        }
        reader.close();
        System.out.println("Starting state of the board:");
        PngMaker png = new PngMaker();
        Grid.PrintGrid(gridArray);
        png.draw(grid.rowSize,grid.colSize,gridArray, "src/Testy/2", 1);
        System.out.println("\n-----------\nIterations: ");
        for(int i=0; i<Integer.parseInt(args[0]); i++) //Loop with iterations
        {
            Grid.ChangeAllCells(gridArray); //Modifies states of all cells once
            System.out.println();
            png.draw(grid.rowSize,grid.colSize,gridArray, "src/Testy/2", i+2);
            Grid.PrintGrid(gridArray);
        }
    }

 */
}
