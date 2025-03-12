package modele;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageSplitter {

    public static void main(String[] args) {
        try {
            BufferedImage originalImage = ImageIO.read(new File("../img/free-nature-images.jpg"));
            int originalWidth  = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();

            int rows = 4; // Nombre de lignes
            int cols = 8; // Nombre de colonnes

            int subImageWidth = originalWidth / cols;
            int subImageHeight = originalHeight / rows;

            BufferedImage[][] subImages = new BufferedImage[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    subImages[i][j] = originalImage.getSubimage(
                        j * subImageWidth, 
                        i * subImageHeight,
                        subImageWidth,
                        subImageHeight
                    );
                }
            }

            System.out.println("Découpage terminé !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}