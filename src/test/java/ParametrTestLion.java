import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrTestLion {

    String sex;
    boolean hasMane;


    public ParametrTestLion(String sex, boolean hasMane) throws Exception {
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
        assertEquals(hasMane, new Lion(sex).doesHaveMane());
    }

}//ПОЧЕМУ ТО ТЕСТЫ ЧЕРЕЗ ПАРАМЕТРИЗИРОВАНЫЙ КЛАСС НЕ ВЛИЯЮТ НА ОЦЕНКУ ПОКРЫТИЯ
