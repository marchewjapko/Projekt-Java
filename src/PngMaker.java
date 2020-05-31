import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PngMaker {

    int width = 10;
    int height = 10;
    int grid[][];

    public PngMaker(int height, int width, int grid[][])
    {
        this.height = height;
        this.width = width;
        this.grid = grid;
    }

    public void draw (int height, int width)
    {

    }

    public static void main(String[] args) throws IOException {

        int width = 3;
        int height = 3;
        int[][] grid = new int[3][3];
        grid [0][0] = 0;
        grid [0][1] = 1;
        grid [0][2] = 2;
        grid [1][0] = 3;
        grid [1][1] = 2;
        grid [1][2] = 1;
        grid [2][0] = 0;
        grid [2][1] = 3;
        grid [2][2] = 1;

        Grid test = new Grid();
        test.PrintGrid(grid);

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, width, height);


        for (int i = 0; i<width; i++ )
        {
            for(int j = 0; j<height;j++)
            {
                //(x,y,szerokosc,wysokosc)
                if(grid[i][j] == 1) {
                    g2d.setColor(Color.yellow);
                    g2d.fillRect(i, j, 1, 1);
                }
                if(grid[i][j] == 2) {
                    g2d.setColor(Color.red);
                    g2d.fillRect(i, j, 1, 1);
                }
                if(grid[i][j] == 3) {
                    g2d.setColor(Color.blue);
                    g2d.fillRect(i, j, 1, 1);
                }


            }
        }

        File file = new File("src\\Testy\\test.png");
        //przetwarzane image, format, plik
        ImageIO.write(bufferedImage, "png", file);





    }
}
