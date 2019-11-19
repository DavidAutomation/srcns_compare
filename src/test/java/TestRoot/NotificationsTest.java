package TestRoot;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NotificationsTest extends BaseTest {

    @Before
    public void init(){

        File NotificationsDesign = new File(Constants.notificationPath);
        File alarmsScreenshots = new File(Constants.newScreenshotsAlarms);
        designScreens = toList(NotificationsDesign.listFiles());
        newScreenshots = recursiveList(alarmsScreenshots,new ArrayList<File>());

    }

    @Test
    public void TestA_CS_malfunction() throws IOException {
        TestImage("CS_malfunction");
    }

    @Test
    public void TestB_control_station_temperature() throws IOException {
        TestImage("control_station_temperature_is_critical");
        TestImage("control_station_temperature_is_high");
    }

    @Test
    public void TestC_cs_battery() throws IOException {
        TestImage("control_station_battery_is_faulty");
        TestImage("control_station_battery_is_low");
        TestImage("Internal_battery_temperature_is_high");
    }

    public void TestD_cs_charger() throws IOException {
        TestImage("pump_charging_error");
        TestImage("Wireless_Charger_temperature_is_high");
    }

    @Test
    public void TestE_bluetooth_connection_problem() throws IOException {
        TestImage("bluetooth_connection_problem_HS");
        TestImage("bluetooth_connection_problem_dialog");
    }

    @Test
    public void TestF_pump_dialogs() throws IOException {
        TestImage("no_pump_detected");
        TestImage("pump_is_not_set_up_completely");
        TestImage("pump_connection_lost");
        TestImage("pump_unexpectedly_removed");
        TestImage("pump_has_active_regimen");

    }

    @Test
    public void TestG_communication() throws IOException {
        TestImage("communication_error");
        TestImage("version_incompatibility");
    }

    @Test
    public void TestH_device_errors() throws IOException {
        TestImage("device_requires_update");
        TestImage("cannot_continue_filling_process");
        TestImage("no_video_file_found");
        TestImage("configuration_file_mismatch");
    }

    @Test
    public void TestI_are_you_sure_dialogs() throws IOException {
        TestImage("are_you_sure_you_want_to_go_back");
        TestImage("are_you_sure_you_want_to_turn_off_pump");
        TestImage("replace_current_pump");
    }

    @Test
    public void TestJ_save_changes() throws IOException {
        TestImage("please_save_changes");
        TestImage("unsaved_changes_regimen");
        TestImage("dosing_regimen_settings_not_saved");
    }

    @Test
    public void TestK_date_and_time_dialogs() throws IOException {
        TestImage("time_mismatch");
        TestImage("date_and_time_cannot_be_adjust_delivery");
    }

    @Test
    public void TestL_prepare_treatment_dialogs() throws IOException {

        TestImage("Cartridge_disconnected_dialog_no_buttons");
        TestImage("process_Interrupted");
        TestImage("process_Incomplete");

    }









}
