package TestRoot;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HpAlarms extends BaseTest {


    @Before
    public void init(){

        File hpDesign = new File(Constants.HpPath);
        File hpScreenShots = new File(Constants.newScreenshotsAlarms);
        designScreens = toList(hpDesign.listFiles());
        newScreenshots = recursiveList(hpScreenShots,new ArrayList<File>());
    }

    @Test
    public void testA_pump_malfunction() throws IOException {
        TestImage("pump_malfunction_HS");
        TestImage("pump_malfunction_dialog");
    }

    @Test
    public void testB_empty_medication() throws IOException {
        TestImage("empty_Medication_HS");
        TestImage("empty_Medication_dialog");
    }

    @Test
    public void testC_pump_battery_is_empty() throws IOException {
        TestImage("pump_battery_is_empty_HS");
        TestImage("pump_battery_is_empty_dialog");
    }

    @Test
    public void testD_treatment_cycle_completed() throws IOException {
        TestImage("treatment_cycle_complete_HS");
        TestImage("treatment_cycle_complete_dialog");
    }

    @Test
    public void testE_occlusion() throws IOException {
        TestImage("occlusion_HS");
        TestImage("occlusion_dialog");
    }

    @Test
    public void testF_cartridge_disconnected() throws IOException {
        TestImage("Cartridge_disconnected_HS");
        TestImage("Cartridge_disconnected_dialog");
    }

    @Test
    public void testG_treatment_paused_too_long() throws IOException {
        TestImage("treatment_paused_too_long_HS");
        TestImage("treatment_paused_too_long_dialog");
    }





}
