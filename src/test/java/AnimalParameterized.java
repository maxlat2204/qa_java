import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterized {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

    @Spy
    Animal animal;

    String animalKind;
    List<String> expectedEat;

    public AnimalParameterized(String animalKind, List<String> expectedEat) {
        this.animalKind = animalKind;
        this.expectedEat = expectedEat;
    }

    @Parameterized.Parameters(name = "animalKind = {0}, expectedEat = {1}")
    public static Object[][] data(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
        public void checkAnimalGetFood() throws Exception {
        assertEquals(expectedEat, animal.getFood(animalKind));
    }
}
//ПОЧЕМУ ТО ТЕСТЫ ЧЕРЕЗ ПАРАМЕТРИЗИРОВАНЫЙ КЛАСС НЕ ВЛИЯЮТ НА ОЦЕНКУ ПОКРЫТИЯ
