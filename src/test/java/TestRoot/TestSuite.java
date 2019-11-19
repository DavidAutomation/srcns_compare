package TestRoot;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FTUTest.class,
        HomeTest.class,
        FillingFlowTest.class,
        HpAlarms.class,
        LpAlarms.class,
        NotificationsTest.class,
})

public class TestSuite {
}
