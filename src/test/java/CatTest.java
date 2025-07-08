import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
    public class CatTest {
    @Mock
    private Feline feline;

    private Cat cat;

    @Before
    public void createNewInstance() {
        cat = new Cat(feline);
    }

    @Test
    // Проверка метода GetSound
        public void checkGetSound(){
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, food);
    }
}


