import unittest
from calculator import Calculator

class TestCalc(unittest.TestCase):
    
    def test_calc_addition_for_correct_result(self):
        calc = Calculator()
        result = calc.add(2,2)
        self.assertEqual(4, result)

if __name__ == '__main__':
    unittest.main()