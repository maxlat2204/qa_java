import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    Feline feline = new Feline();
    LionAlex lionAlex;

    @Before
    public void addLion() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void checkGetKittens() throws Exception {
        int kittens1 = lionAlex.getKittens();
        assertEquals(0, kittens1);
    }

    @Test
    public void checkGetFriends() throws Exception {
        List<String> friends = lionAlex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void checkGetPlaceOfLiving() throws Exception{
        String living = lionAlex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", living);
    }

}
