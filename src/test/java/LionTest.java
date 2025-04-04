import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    //    @Spy
    Feline feline = new Feline();
    Lion lion = new Lion(feline);


    @Test
    public void checkGetKittens() throws Exception {
        int kittens1 = lion.getKittens();
        assertEquals(1, kittens1);
    }

    @Test
    public void checkGetFood() throws Exception {
        List<String> eat = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), eat);
    }

    @Test
    public void checkAddLionNegativeTest() throws Exception {
        assertThrows(Exception.class, () -> new Lion("Непонятный"));
    }

    @Test
    public void checkMale() throws Exception {
        assertEquals(true, new Lion("Самец").doesHaveMane());
    }
    @Test
    public void checkFemale() throws Exception {
        assertEquals(false, new Lion("Самка").doesHaveMane());
    }
}


