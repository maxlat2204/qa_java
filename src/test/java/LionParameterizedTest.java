import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private String sex;
    boolean hasMane;
    Feline feline = new Feline();


    public LionParameterizedTest(String sex, boolean hasMane) throws Exception {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "sex = {0}, hasMane = {1}")
    public static Object[][] data(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
        public void checkLion() throws Exception {
        assertEquals(hasMane, new Lion(sex, feline).doesHaveMane());
    }

}
