package TestRoot;

public class Constants {

    public static String slash = System.getProperty("os.name").toLowerCase().contains("win")? "\\": "/";
    //Design images Path
    public static final String projectPath = System.getProperty("user.dir");
    public static final String screenPoolPath = projectPath + slash + "Screens_Pool";
    public static final String ftuPath = screenPoolPath + slash + "FTU";
    public static final String FillingFlowPath = screenPoolPath + slash + "FillingFlow";
    public static final String homePath = screenPoolPath + slash + "HomeScreen";
    public static final String HpPath = screenPoolPath + slash + "HP";
    public static final String LpPath = screenPoolPath + slash + "LP";
    public static final String menuPath = screenPoolPath + slash + "Menu";
    public static final String notificationPath = screenPoolPath + slash + "Notification";

    //Spoon screenshots paths
    public static final String newScreenshotsPath = projectPath + slash + "app_spoon-screenshots";
    public static final String newScreenshotsFTU = newScreenshotsPath + slash+"androidTest.espressotestjava.tests.Test01_FTU_Flow"+slash+"test01_full_ftu_flow";
    public static final String newScreenshotsFillFlow = newScreenshotsPath + slash + "androidTest.espressotestjava.tests.Test03_FillingFlow"+slash+"test1_full_fulling_flow";
    //Alarms path
    public static final String newScreenshotsAlarms = newScreenshotsPath + slash +"androidTest.espressotestjava.tests.Test04_Alarms";
    public static final String newScreenshotsCsMalfunctions = newScreenshotsAlarms + slash + "testA_CsMalfunctions";
    public static final String newScreenshotsCsNotifications = newScreenshotsAlarms + slash + "testF_CS_notifications";
    public static final String newScreenshotsDialogsNotifications =  newScreenshotsAlarms + slash + "testG_cs_dialogs_notifications";
    public static final String newScreenshotsLpHome =newScreenshotsAlarms + slash +"testD_Lp_alarms_HS";
    public static final String newScreenshotsLpDialogs =newScreenshotsAlarms + slash + "testE_Lp_alarms_dialogs";
    public static final String newScreenshotsHpDialogs = newScreenshotsAlarms + slash + "testB_Hp_alarms_HS";
    public static final String newScreenshotsHpHome = newScreenshotsAlarms + slash + "testC_Hp_alarms_dialogs";
    public static final String newScreenshotsPrepareTreatmentDialogs = newScreenshotsAlarms + slash + "testH_dialogs_prepare_treatment";

    //Menu screenshots Path
    public static final String newScreenshotsMenu = newScreenshotsPath + slash + "androidTest.espressotestjava.tests.Test02_Home";
    public static final String newScreenshotsMenuImages = newScreenshotsMenu + "testA_side_menu";
    public static final String newScreenshotsRegimen = newScreenshotsMenu + "testB_dosing_regimen_overview";
    public static final String newScreenshotsTreatmentHistory = newScreenshotsMenu + "testC_treatment_history";
    public static final String newScreenshotsPumpControl = newScreenshotsMenu + "testD_pump_control";
    public static final String newScreenshotsCustomerCare = newScreenshotsMenu + "testE_customer_care";
    public static final String newScreenshotsAdditionalGuidance = newScreenshotsMenu + "testF_Additional_guidance";
    public static final String newScreenshotsLanguage = newScreenshotsMenu + "testG_language";
    public static final String newScreenshotsConnectedDevices = newScreenshotsMenu + "testH_connected_devices";
    public static final String newScreenshotsCsOverview = newScreenshotsMenu + "testI_cs_overview";
    public static final String newScreenshotsVersionDetails = newScreenshotsMenu + "testJ_version_details";
    public static final String newScreenshotsPrivacyPolicy = newScreenshotsMenu + "testK_privacy_policy";




    public static final String diffOutput = projectPath + slash + "ImageDiff" + slash;



    public static final float threshold = 95;

}
