import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        int result = calculateTotalCapacity(list);

        assertEquals(128, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        int result = calculateTotalCapacity(list);

        assertEquals(152, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72)
        );

        int result = calculateTotalCapacity(list);

        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int result = calculateTotalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = List.of(
                new Bogie("General", 90),
                new Bogie("Sleeper", 72)
        );

        int result = calculateTotalCapacity(list);

        assertEquals(162, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        calculateTotalCapacity(list);

        assertEquals(2, list.size());
    }
}