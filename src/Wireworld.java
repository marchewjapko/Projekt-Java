public class Wireworld {
    public static void print_grid(int[][] grid)
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
    public static int how_many_alive(int current_row, int current_col, int [][] grid)
    {
        int size_col = grid.length;
        int size_row = grid[0].length;
        int number = 0; //Ilosc sasiadow
        int i_start = -1;
        int k_start = -1;
        int i_end = 1;
        int k_end = 1;
        //Ponizsze if-y zmieniaja indeksy sprawdzanych komorek w zaleznosci gdzie sie znajduja, jezeli komorka znajduje sie w srodku planszy to ma osiem sasiadow i nie trzeba tego zmieniac
        if(current_row==0 && current_col==0) //Poczatek planszy
        {
            i_start = k_start = 0;
        }
        else if(current_col==size_col-1 && current_row==size_row-1) //Koniec planszy
        {
            k_end = i_end = 0;
        }
        else if(current_row==0 && current_col==size_col-1) //Prawy gorny rog planszy
        {
            i_start = 0;
            k_end = 0;
        }
        else if(current_row==size_row && current_col==0) //Lewy dolny rog planszy
        {
            i_end = 0;
            k_start = 0;

        }
        else if(current_row==0) //Gorny wiersz planszy
            i_start = 0;
        else if(current_col==0) //Pierwsza kolumna planszy
            k_start = 0;
        else if(current_row==size_row-1) //Dolny wiersz planszy
            i_end = 0;
        else if(current_col==size_col-1) //Ostatnia kolumna planszy
            k_end = 0;

        for(int i=i_start; i<=i_end; i++) //Badanie stanow sasiadow komorki grid[current_row][current_col]
        {
            for(int k=k_start; k<=k_end; k++)
            {
                if(i==0 && k==0) //Nie chcemy zeby komorka byla swoim sasiedem
                    continue;
                if(grid[current_col+k][current_row+i]==3 /*|| grid[current_row+i][current_col+k]==3*/)
                    number++;
            }
        }
        return number;
    }
    public static void main(String[] args )
    {
        int [][] grid = new int[4][3]; //Horizontal 4x3
        grid[0][0]=0;
        grid[1][0]=0;
        grid[2][0]=0;
        grid[3][0]=0;
        grid[0][1]=3;
        grid[1][1]=1;
        grid[2][1]=1;
        grid[3][1]=1;
        grid[0][2]=0;
        grid[1][2]=0;
        grid[2][2]=0;
        grid[3][2]=0;

        int size_row = grid[0].length;
        int size_col = grid.length;
        print_grid(grid);
        for(int i=0; i<5; i++) //Petla na ktorej beda tworzone kolejne iteracje
        {
            for(int current_row=0; current_row<size_row; current_row++)
            {
                for(int current_col=0; current_col<size_col; current_col++)
                {
                    if(grid[current_col][current_row] != 0)
                    {
                        int number_of_alive = how_many_alive(current_row, current_col, grid);
                        if (number_of_alive == 1 && grid[current_col][current_row] == 1) //Jezeli badana komorka nie ma ani 3 ani 2 sasiadow && (jest zywya || jest zywa, ale byla martwa)
                        {
                            grid[current_col][current_row] = 4;
                        }
                    }
                }
            }
            for(int current_row=0; current_row<size_row; current_row++) //Petla ktora zmieni wartosci komorek: 2 -> 1 , 3 -> 0
            {
                for(int current_col=0; current_col<size_col; current_col++)
                {
                    if(grid[current_col][current_row]==3)
                        grid[current_col][current_row] = 2;
                    else if(grid[current_col][current_row]==4)
                        grid[current_col][current_row] = 3;
                    else if(grid[current_col][current_row]==2)
                        grid[current_col][current_row] = 1;
                }
            }
            System.out.println("\n");
            print_grid(grid);
        }
    }
}
