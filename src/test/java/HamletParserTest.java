import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String actual = hamletParser.changeHamletToLeon();
        Assert.assertTrue(!actual.contains("Hamlet"));
    }

    @Test
    public void testChangeHoratioToTariq() {
        String actual = hamletParser.changeHoratioToTariq();
        Assert.assertTrue(!actual.contains("Haratio"));
    }

    @Test
    public void testFindHoratio() {
        boolean expected = true;
        boolean actual = hamletParser.findHoratio();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHamlet() {
        boolean expected = true;
        boolean actual = hamletParser.findHamlet();
        Assert.assertEquals(expected,actual);
    }
}