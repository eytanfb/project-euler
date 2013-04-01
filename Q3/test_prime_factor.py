import unittest
from prime_factor_finder import PrimeFactorFinder

class TestPrimeFactor(unittest.TestCase):
    
    def setUp(self):
        self.prime_factor_finder = PrimeFactorFinder()
    
    def test_finding_factors(self):
        factors_of_138 = [1, 2, 3, 6, 23, 46, 69, 138]
        self.assertEquals(self.prime_factor_finder.find_factors(138), factors_of_138)
        
    def test_isPrime(self):
        self.assertTrue(self.prime_factor_finder.isPrime(7))
        self.assertTrue(self.prime_factor_finder.isPrime(11))
        self.assertTrue(self.prime_factor_finder.isPrime(13))
        self.assertFalse(self.prime_factor_finder.isPrime(6))
        self.assertFalse(self.prime_factor_finder.isPrime(15))
        self.assertFalse(self.prime_factor_finder.isPrime(25))
    
    def test_find_largest_prime_factor(self):
        self.assertEquals(23, self.prime_factor_finder.find_largest_prime_factor(138))
        
if __name__ == '__main__':
    unittest.main()