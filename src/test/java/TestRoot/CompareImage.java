package TestRoot;

import sun.rmi.runtime.Log;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

public class CompareImage {

    //read image from file
    public static BufferedImage readImage(File image){
        try {
            return ImageIO.read(image);
        }catch (Exception e)
        {
            return null;
        }
    }


//    //comparing between 2 images and returning the diff percentage.
//    public static float compareImages(BufferedImage fileA, BufferedImage fileB){
//        float percentage = 0;
//        try {
//            // take buffer data from both image files //
//            BufferedImage biA = fileA;
//            DataBuffer dbA = biA.getData().getDataBuffer();
//            int sizeA = dbA.getSize();
//            BufferedImage biB = fileB;
//            DataBuffer dbB = biB.getData().getDataBuffer();
//            int sizeB = dbB.getSize();
//            int count = 0;
//            // compare data-buffer objects //
//            if (sizeA == sizeB) {
//
//                for (int i = 0; i < sizeA; i++) {
//
//                    if (dbA.getElem(i) == dbB.getElem(i)) {
//                        count = count + 1;
//                    }
//
//                }
//
//                percentage = (count * 100) / sizeA;
//            } else {
//                System.out.println("Both the images are not of same size");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Failed to compare image files ...");
//        }
//        return percentage;
//    }

    //hide the icons on the top right corner (Clock, Ble icon and delivery icon)
    public static BufferedImage hideClock(BufferedImage buffImage){
        Graphics2D g2d = buffImage.createGraphics();
        int left = buffImage.getWidth() - (int) (buffImage.getWidth() * 0.25f);
        int bottom = (int) (buffImage.getHeight() * 0.13f);
        int right = buffImage.getWidth();
//        g2d.setColor(Color.BLACK);
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(left, 0, right, bottom);
        g2d.dispose();

        return buffImage;

    }

    //looking for the different pixels and highlight them.
    public static float sameAs(BufferedImage buffimg1, BufferedImage buffimg2, String imageToTest) throws Exception {
        // convert images to pixel arrays...
        boolean same = true;
        float percentage;
        int count = 0;
        BufferedImage img1 = hideClock(buffimg1);
        BufferedImage img2 = hideClock(buffimg2);
        final int w = img1.getWidth(),
                h = img1.getHeight(),
                highlight = Color.MAGENTA.getRGB();

        final int[] p1 = img1.getRGB(0, 0, w, h, null, 0, w);
        final int[] p2 = img2.getRGB(0, 0, w, h, null, 0, w);
        // compare img1 to img2, pixel by pixel. If different, highlight img1's pixel...

        if(p1.length != p2.length)
        {
            throw new Exception("Error: The images size is not equal");
        }
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != p2[i]) {
                same = false;
                p1[i] = highlight;
            }
            else
            {
                count ++;
            }
        }

        percentage = (count * 100) / p1.length;

        //checking if the the images are the same && if the similarity percentage is below threshold (95%)
        if(!same && percentage < Constants.threshold ) {
                createDiffImage(w,h,p1,imageToTest);
        }
        return percentage;
    }


    public static void createDiffImage(int w, int h, int [] p1,String imageToTest) {
        // save img1's pixels to a new BufferedImage, and return it...
        // (May require TYPE_INT_ARGB)
        final BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        out.setRGB(0, 0, w, h, p1, 0, w);
        try {
            ImageIO.write(out,"png",new File(Constants.diffOutput+imageToTest+".png"));
        }catch (Exception e){
        }
    }


}
