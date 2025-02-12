import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void fahrenheitToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100, temperatureConverter.fahrenheitToCelsius(212));
        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40));
    }

    @Test
    void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212, temperatureConverter.celsiusToFahrenheit(100));
        assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40));
    }

    @Test
    void isExtremeTemperature() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertTrue(temperatureConverter.isExtremeTemperature(-41));
        assertTrue(temperatureConverter.isExtremeTemperature(51));
        assertFalse(temperatureConverter.isExtremeTemperature(-40));
        assertFalse(temperatureConverter.isExtremeTemperature(50));
    }
}