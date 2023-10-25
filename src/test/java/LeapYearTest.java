import no.hiof.leapyear.LeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    @Nested
    class isLeapYearTest {
        private LeapYear leapyear;

        @BeforeEach
        public void init() {
            leapyear = new LeapYear();
        }

        @Test
        public void isYearDivisibleBy4andNot100() {
            assertTrue(leapyear.isLeapYear(2004));
            assertTrue(leapyear.isLeapYear(1996));
            assertTrue(leapyear.isLeapYear(2024));
            assertTrue(leapyear.isLeapYear(1984));
            assertTrue(leapyear.isLeapYear(1848));
        }

        @Test
        public void isYearDivisibleBy400() {
            assertTrue(leapyear.isLeapYear(400));
            assertTrue(leapyear.isLeapYear(800));
            assertTrue(leapyear.isLeapYear(1200));
            assertTrue(leapyear.isLeapYear(2000));
            assertTrue(leapyear.isLeapYear(4000));
        }

        @Test
        public void isYearDivisibleBy100andNot400() {
            assertFalse(leapyear.isLeapYear(1700));
            assertFalse(leapyear.isLeapYear(1800));
            assertFalse(leapyear.isLeapYear(2100));
            assertFalse(leapyear.isLeapYear(1100));
            assertFalse(leapyear.isLeapYear(900));
        }

        @Test
        public void isNotYearDivisibleBy4() {
            assertFalse(leapyear.isLeapYear(2003));
            assertFalse(leapyear.isLeapYear(2007));
            assertFalse(leapyear.isLeapYear(2023));
            assertFalse(leapyear.isLeapYear(1997));
            assertFalse(leapyear.isLeapYear(1833));
        }
    }
}