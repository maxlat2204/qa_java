import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
    public class CatTest {
    @Mock
    Predator predator;

    @Spy
    Feline feline;
    Cat cat =new Cat(feline);

    @Test
    // Проверка метода GetSound
        public void checkGetSound(){
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    // Проверка метода GetFood
        public void checkGetFoodTest() throws Exception {
        when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> catFood = cat.getFood();
        assertEquals(predator.eatMeat(), catFood);
    }
}


