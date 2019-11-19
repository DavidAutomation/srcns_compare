package TestRoot;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.fail;

public class FTUTest extends BaseTest {

    @Before
    public void init(){

        //get the list of all the images in FTU directories from both Design and spoon and initialize the files lists.
        File ftuDesign = new File(Constants.ftuPath);
        File ftuScreenShots = new File(Constants.newScreenshotsFTU);


        designScreens = toList(ftuDesign.listFiles());
        newScreenshots = toList(ftuScreenShots.listFiles());
    }


    //2 image are the same so the test will pass
    @Test
    public void testA_Language() throws IOException {

        TestImage("Ftu_Language");
    }

    // different images so the test will fail and will create the diff image in ImageDiff directory
    @Test
    public void testB_StartUpActivity() throws IOException {

        TestImage("Start_Up_Activity_First");
        TestImage("Start_Up_Activity_Second");
        TestImage("Start_Up_Activity_Third");

    }
    @Test
    public void testC_DateActivity() throws IOException {

        TestImage("Date_Activity_Year");
        TestImage("Date_Activity_Day");
        TestImage("Date_Activity_Month");

    }
    @Test
    public void testD_TimeActivity() throws IOException {

        TestImage("Time_Activity_Minutes");
        TestImage("Time_Activity_Hours");

    }

    @Test
    public void testE_PairPump() throws IOException {

        TestImage("Pair_Pump_Activity");
        TestImage("Pump_Feedback");

    }

    @Test
    public void testF_Password() throws IOException {

        TestImage("Password_Incorrect");
        TestImage("Password_Default");

    }

    @Test
    public void testG_Regimen() throws IOException {

        TestImage("Dosing_Regimen_Overview");
        TestImage("Edit_Dosing_Regimen_Day_Rate");
        TestImage("Edit_Dosing_Regimen_Total_Rate");

    }

    @Test
    public void testG_setUpCompleted() throws IOException {

        TestImage("set_Up_Completed");

    }





}
