package TestRoot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.fail;

public class BaseTest {

    List<File> designScreens;
    List<File> newScreenshots;


    public void TestImage(String imageToTest) {
        File f1 = getScreenShot(designScreens,imageToTest);
        File f2 =getScreenShot(newScreenshots,imageToTest);

        BufferedImage design = CompareImage.readImage(f1);
        BufferedImage newPic = CompareImage.readImage(f2);

        try {

            if(CompareImage.sameAs(newPic, design,imageToTest) < Constants.threshold)
            {
                fail(imageToTest+" Screen is not match to Design");
            }
        }catch (Exception e)
        { }
    }

    //find file by file name
    private File getScreenShot(List <File> files,String fileName){
        for(File f : files)
        {
            if(f.getName().contains(fileName)){
                return f;
            }
        }
        throw new NullPointerException(fileName + " does not exist in this path");
    }

//    public File[] append(File[] arr, File[] elements) {
//        int N = arr.length;
//        int N2 = elements.length;
//        arr = Arrays.copyOf(arr, N + N2);
//        for (int i = 0, j = N; i<N2;i++,j++)
//        {
//            arr[j] = elements[i];
//        }
//        return arr;
//    }

    public List<File> toList(File[] files){

        List<File> result = new ArrayList<File>();
        for (File file:files)
        {
            result.add(file);
        }

        return result;
    }


//    public static void recursiveList(String path) {
////
////        File f = new File(path);
////        File[] fl = f.listFiles();
////        for (int i = 0; i < fl.length; i++) {
////            if (fl[i].isDirectory() && !fl[i].isHidden()) {
////                recursiveList(fl[i].getAbsolutePath());
////            } else {
////                System.out.println(fl[i].getName());
////            }
////        }
////    }

    public static List<File> recursiveList(File path, List<File> result){
        if(path.isFile())
        {
            result.add(path);
        }else {
            for (File file : path.listFiles())
            {
                recursiveList(file,result);
            }
        }
        return result;

    }
}
