import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {

    @Test
    void logPracticeIncrementsTotalSessionsAndPrintsMessage() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 0, 0);
        tracker.logPractice(2);
        assertEquals(1, tracker.getTotalSessions());
    }

    @Test
    void logPracticeIncrementsPracticeHours() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 0, 0);
        tracker.logPractice(2);
        assertEquals(2, tracker.getPracticeHours());
    }

    @Test
    void logPracticeIncrementsTotalSessions() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 0, 0);
        tracker.logPractice(8);
        tracker.logPractice(2);
        assertEquals(2, tracker.getTotalSessions());
    }

    @Test
    void isEligibleForKyuReturnsTrueWhenTotalSessionsAre100() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 100, 100);
        assertTrue(tracker.isEligibleForKyu());
    }

    @Test
    void isEligibleForKyuReturnsFalseWhenTotalSessionsAreLessThan100() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 99, 99);
        assertFalse(tracker.isEligibleForKyu());
    }

    @Test
    void getStudentNameReturnsCorrectValue() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 10, 10);
        assertEquals("John Doe", tracker.getStudentName());
    }

    @Test
    void getStartDateReturnsCorrectValue() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 10, 10);
        assertEquals(LocalDate.now(), tracker.getStartDate());
    }

    @Test
    void getTotalSessionsReturnsCorrectValue() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 10, 10);
        assertEquals(10, tracker.getTotalSessions());
    }

    @Test
    void getPracticeHoursReturnsCorrectValue() {
        AikidoTracker tracker = new AikidoTracker("John Doe", LocalDate.now(), 10, 10);
        assertEquals(10, tracker.getPracticeHours());
    }
}