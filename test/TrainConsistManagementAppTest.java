import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Helper method (same logic as UC8)
    private List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        List<Bogie> result = filterBogies(list, 60);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("AC Chair", 60));

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty()); // should NOT include equal
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("First Class", 24));

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("General", 90));

        List<Bogie> result = filterBogies(list, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        filterBogies(list, 60);

        // original list should remain same
        assertEquals(2, list.size());
    }
}
