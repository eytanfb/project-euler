import math

class PrimeFactorFinder(object):

    def find_factors(self, number):
        factors = list()
        for i in range(1, self.__ceiled_sqrt(number)):
            if number % i == 0:
                factors.append(i)
                factors.append(number / i)

        factors.sort()
        return factors

    def isPrime(self, number):
        for i in range(2, self.__ceiled_sqrt(number)):
            if number % i == 0:
                return False

        return True

    def find_largest_prime_factor(self, number):
        factors = self.find_factors(number)
        prime_factors = list()
        for i in range(1, len(factors)):
            if self.isPrime(factors[i]):
                prime_factors.append(factors[i])

        return prime_factors[-1]

    def __ceiled_sqrt(self, number):
        return int(math.ceil(math.sqrt(number))) + 1