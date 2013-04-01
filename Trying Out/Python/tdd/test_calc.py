import unittest
from calculator import Calculator

class TestCalc(unittest.TestCase):
    
    def setUp(self):
        self.calc = Calculator()
    
    def test_calc_addition_for_correct_result(self):
        result = self.calc.add(2,2)
        self.assertEqual(4, result)
    
    def test_error_message_if_both_not_numbers(self):
        self.assertRaises(ValueError, self.calc.add, 'two', 'three')
    
    def test_error_message_if_one_of_the_args_is_not_a_number(self):
        self.assertRaises(ValueError, self.calc.add, 'two', 3)
        self.assertRaises(ValueError, self.calc.add, 2, 'three')
        
if __name__ == '__main__':
    unittest.main()