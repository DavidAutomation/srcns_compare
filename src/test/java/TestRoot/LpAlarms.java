package TestRoot;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LpAlarms extends BaseTest {

    @Before
    public void init(){

        File lpDesign = new File(Constants.LpPath);
        File alarmsScreenShots = new File(Constants.newScreenshotsAlarms);
        designScreens = toList(lpDesign.listFiles());
        newScreenshots = recursiveList(alarmsScreenShots,new ArrayList<File>());
    }

    @Test
    public void testA_treatment_paused() throws IOException {
        TestImage("treatment_paused_HS");
        TestImage("treatment_paused_dialog");
    }

    @Test
    public void testB_pump_battery_is_low() throws IOException {
        TestImage("pump_battery_is_low_HS");
        TestImage("pump_battery_is_low_dialog");
    }

    @Test
    public void testC_medication_delivery_will_stop_soon() throws IOException {
        TestImage("medication_delivery_will_stop_soon_HS");
        TestImage("medication_delivery_will_stop_soon_dialog");
    }
}
