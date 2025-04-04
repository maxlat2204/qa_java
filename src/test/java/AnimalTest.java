import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Spy
    Animal animal;

    @Test
    public void checkAnimalGetFoodHerbivore() throws Exception {
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void checkAnimalGetFoodPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    public void checkAnimalGetFoodNegativeTest() throws Exception {
        assertThrows(Exception.class, () -> animal.getFood("Непонятный"));
    }

    @Test
    public void checkGetFamily() throws Exception {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

}
