def solution(upper_limit):
    """ (int) -> int
    
        Return the least common multiple of numbers up to upper_limit
    
        >>> solution(8)
        420
        >>> solution(10)
        2520
    """
    return reduce(lcm, range(1, upper_limit))
    
def euclid_gcd(a, b):
    """ (int, int) -> int
        
        Return greatest common divisor using Euclid's algorithm
    
        >>> euclid_gcd(4, 8)
        4
        >>> euclid_gcd(36, 96)
        12
    """
    while b != 0:
        a, b = b, a % b
    return a
    
def lcm(a, b):
    """ (int, int) -> int
    
        Return the least common multiple using euclid_gcd(a, b)
        
        >>> lcm(4, 8)
        8
        >>> lcm(16, 44)
        176
    """
    return a * b // euclid_gcd(a, b)
        
    
import doctest
doctest.testmod()