import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

//@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
//    @Spy
    Animal animal = new Animal();


    @Test
    public void checkAnimalGetFoodNegativeTest() throws Exception {
        assertThrows(Exception.class, () -> animal.getFood("Непонятный"));
    }

    @Test
    public void checkGetFamily() throws Exception {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

}
