import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
    public class CatTest {

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
        public void checkGetFoodNegativeTest() {
        assertThrows(Exception.class, () -> cat.getFood());
    }

}
