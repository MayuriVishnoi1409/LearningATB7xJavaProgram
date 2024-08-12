package august.real;

public class TestCase2 extends BaseTest {
    void testCase2()
    {
        startBrowser();
        GetDataFromMySql();
        System.out.println(gold);
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
        new TestCase().testCase1();

    }


    }


