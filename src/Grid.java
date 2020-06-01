public class Grid
{
    public int rowSize;
    public int colSize;
    public int [][] GetGridArray(int rowSize, int colSize)
    {
        return new int[rowSize][colSize];
    }
    protected static void PrintGrid(int[][] grid) //Prints out the board to standard output
    {
        for(int i = 0; i < grid[0].length; i++)
        {
            for(int k = 0; k < grid.length; k++)
            {
                System.out.print(grid[k][i] + "\t");
            }
            System.out.print("\n");
        }
    }
    private static int HowManyAlive(int current_row, int current_col, int [][] grid) //Checks cell's neighbors
    {
        int number = 0; //Number of electron head neighbors
        int iStart = -1; //Starting row, relative to current cell
        int kStart = -1; //Starting column, relative to current cell
        int iEnd = 1; //Last row, relative to current cell
        int kEnd = 1;//Last column, relative to current cell
        // Ifs mentioned below specify the coordinates of cells that the current cell has depending on its position (maximum is eight)
        if(current_row==0 && current_col==0) //Upper left corner
        {
            iStart = kStart = 0;
        }
        else if(current_col==grid.length-1 && current_row==grid[0].length-1) //Bottom right corner
        {
            kEnd = iEnd = 0;
        }
        else if(current_row==0 && current_col==grid.length-1) //Upper right corner
        {
            iStart = 0;
            kEnd = 0;
        }
        else if(current_row==grid[0].length-1 && current_col==0) //Bottom left corner
        {
            iEnd = 0;
            kStart = 0;
        }
        else if(current_row==0) //Top row
            iStart = 0;
        else if(current_col==0) //First column
            kStart = 0;
        else if(current_row==grid[0].length-1) //Bottom row
            iEnd = 0;
        else if(current_col==grid.length-1) //Last column
            kEnd = 0;

        for(int i=iStart; i<=iEnd; i++) //Checking cell's neighbors' states
        {
            for(int k=kStart; k<=kEnd; k++)
            {
                if(i==0 && k==0) //Cell cannot be its own neighbor
                    continue;
                if(grid[current_col+k][current_row+i]==3)
                    number++;
            }
        }
        return number;
    }
    protected static void ChangeAllCells(int [][] grid)
    {
        for (int currentRow = 0; currentRow < grid[0].length; currentRow++) {
            for (int currentCol = 0; currentCol < grid.length; currentCol++) {
                if (grid[currentCol][currentRow] != 0) {
                    int number_of_alive = Grid.HowManyAlive(currentRow, currentCol, grid);
                    if ((number_of_alive == 1 || number_of_alive == 2) && grid[currentCol][currentRow] == 1) //If current cell has one or two electron head neighbors and is a conductor
                    {
                        grid[currentCol][currentRow] = 4; //Cell's state changes to electron head, while remembering that in current iteration it was a conductor
                    }
                }
            }
        }
        for (int currentRow = 0; currentRow < grid[0].length; currentRow++) //Loop that changes cell's state: electron head to electron tail
        {                                                                   //New electron head to established electron head, electron tail to conductor
            for (int currentCol = 0; currentCol < grid.length; currentCol++) {
                if (grid[currentCol][currentRow] == 3) //Electron head to electron tail
                    grid[currentCol][currentRow] = 2;
                else if (grid[currentCol][currentRow] == 4) //Newly created electron head to established electron head
                    grid[currentCol][currentRow] = 3;
                else if (grid[currentCol][currentRow] == 2) //Electron tail to conductor
                    grid[currentCol][currentRow] = 1;
            }
        }
    }
}
