package ittltl;

import com.pi4j.io.gpio.*;
import org.junit.Test;

public class FlashTest {

	@Test
	public void test() {
    GpioController gpioController = GpioFactory.getInstance();
    GpioPinDigitalOutput pin = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_00, "pin_0", PinState.LOW);
    pin.setState(PinState.HIGH);
  }

}
