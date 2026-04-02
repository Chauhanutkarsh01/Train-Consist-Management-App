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

    private List<Bogie> loopFilter(List<Bogie> list) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    private List<Bogie> streamFilter(List<Bogie> list) {
        return list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50)
        );

        List<Bogie> result = loopFilter(list);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50)
        );

        List<Bogie> result = streamFilter(list);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50),
                new Bogie("C", 80)
        );

        assertEquals(
                loopFilter(list).size(),
                streamFilter(list).size()
        );
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue(end - start >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("B" + i, i % 100));
        }

        List<Bogie> result = streamFilter(list);

        assertNotNull(result);
    }
}