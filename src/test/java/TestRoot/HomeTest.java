package TestRoot;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HomeTest extends BaseTest {

    //TODO: 1. look for a way to generate following screens:
    // pump status ( delivery, no delivery), pump cannot be found
    @Before
    public void init(){

        File homeDesign = new File(Constants.homePath);
        File homeScreenShots = new File(Constants.newScreenshotsMenu);
        designScreens = toList(homeDesign.listFiles());
        newScreenshots = recursiveList(homeScreenShots,new ArrayList<File>());
    }

    @Test
    public void testA_menu() throws IOException {

        TestImage("Menu_top");
        TestImage("Menu_bottom");
    }

    @Test
    public void testB_Dosing_Regimen_Overview_Menu() throws IOException {
        TestImage("Dosing_Regimen_Overview_Menu");
    }

    @Test
    public void testC_Treatment_History() throws IOException {
        TestImage("Treatment_History");
    }

    @Test
    public void testD_Pump_Control() throws IOException {
        TestImage("Pump_Control");
    }

    @Test
    public void testE_Customer_Care() throws IOException {
        TestImage("Customer_Care");
    }

    @Test
    public void testF_Additional_Guidance() throws IOException {
        TestImage("Additional_Guidance");
        //add the troubleshooting screenshot to screen pool and add a test.
    }

    @Test
    public void testG_Connected_Device() throws IOException {
        TestImage("Connected_Device");
    }

    @Test
    public void testH_cs_overview() throws IOException {
        TestImage("CS_Logs");
        TestImage("Factory_Data_Reset");
    }

    @Test
    public void testI_Version_Details() throws IOException {
        TestImage("Version_Details_top");
        TestImage("Version_Details_bottom");
    }

    @Test
    public void testJ_Privacy_Policy() throws IOException {
       TestImage("Privacy_Policy");
    }

    @Test
    public void testK_language() throws IOException {
        TestImage("Language_Menu");
    }

}
