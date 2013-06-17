import unittest
import wiringpi

class FlashTest(unittest.TestCase):

    def test(self):
        gpio_number = 0
        wiringpi.wiringPiSetup()

        wiringpi.pinMode(gpio_number, wiringpi.OUTPUT)
        wiringpi.digitalWrite(gpio_number, 1)

if __name__ == '__main__':
    unittest.main()