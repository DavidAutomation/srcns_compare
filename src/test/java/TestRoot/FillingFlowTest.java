package TestRoot;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.IOException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FillingFlowTest extends BaseTest {


    @Before
    public void init(){

        File fillFlowDesign = new File(Constants.FillingFlowPath);
        File fillFlowScreenShots = new File(Constants.newScreenshotsFillFlow);
        designScreens = toList(fillFlowDesign.listFiles());
        newScreenshots = toList(fillFlowScreenShots.listFiles());
    }

    @Test
    public void TestA_DisposeOfUsedMaterials() throws IOException {
        TestImage("Dispose_Of_Used_Materials");
    }
    @Test
    public void TestB_Connect_A_New_cartridge() throws IOException {
        TestImage("Connect_A_New_cartridge");
    }
    @Test
    public void TestC_Insert_New_Vials() throws IOException {
        TestImage("Insert_New_Vials");
    }
    @Test
    public void TestD_Fill_Medication() throws IOException {
        TestImage("Fill_Medication");
    }
    @Test
    public void TestE_Fill_medication_ProgressBar() throws IOException {
        TestImage("Filling_medication_ProgressBar");
    }
    @Test
    public void TestF_Remove_Vials_Adapters() throws IOException {
        TestImage("Remove_Vial_Adapter");
    }
    @Test
    public void TestG_Connect_Infusion_sets() throws IOException {
        TestImage("Connect_Infusion_sets");
    }
    @Test
    public void TestH_Prepare_Infusion_sets() throws IOException {
        TestImage("Prepare_Infusion_sets");
    }
    @Test
    public void TestI_Insert_Cannulas() throws IOException {
        TestImage("Insert_Cannulas");
    }
    @Test
    public void TestJ_Charge_Battery() throws IOException {
        TestImage("Charge_Battery_20");
        TestImage("Charge_Battery_100");
    }
    @Test
    public void TestK_Connect_Tubes_To_Cannulas() throws IOException {
        TestImage("Connect_Tubes_To_Cannulas");
    }
    @Test
    public void TestL_Pump_Ready() throws IOException {
        TestImage("Pump_Ready");
    }
    @Test
    public void TestL_Start_Infusion() throws IOException {
        TestImage("Start_Infusion");
    }
    @Test
    public void TestM_Delivery_On() throws IOException {
        TestImage("Delivery_On");
    }

}
