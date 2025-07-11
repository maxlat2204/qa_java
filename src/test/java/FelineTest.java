import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

//    @Spy
    Feline feline = new Feline();

    @Test
    public void checkEatMeat() throws Exception {
        List<String> eat = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), eat);
    }

    @Test
    public void checkGetFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void checkGetKittens1() {
        int kittens1 = feline.getKittens();
        assertEquals(1, kittens1);
    }

    @Test
    public void checkGetKittens5() {
        int kittens5 = feline.getKittens(5);
        assertEquals(5, kittens5);
    }
}
