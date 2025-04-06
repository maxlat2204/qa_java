import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {

    Feline feline = new Feline();
    Lion lion;

    @Before
    public void addLion() throws Exception {
    lion = new Lion("Самец", feline);
    }

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
    public void checkAddLionNegativeTest() {
        assertThrows(Exception.class, () -> new Lion("Непонятный", feline));
    }

}




