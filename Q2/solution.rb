class Solution
  def find_even_number(fibonacci_sequence)
    #puts fibonacci_sequence
    fibonacci_sequence.select { |number| number.even? }
  end
  
  def create_fibonacci_upto(max)
    fibonacci = [1, 2]
    next_fibonacci = 2
    while next_fibonacci < max do
      next_fibonacci = fibonacci[-1] + fibonacci[-2]
      fibonacci.push next_fibonacci
    end
    return fibonacci
  end
  
  def add_even_fibonnaci(even_sequence)
    even_sequence.inject{ |sum,x| sum + x }
  end
end

solution = Solution.new
puts solution.add_even_fibonnaci solution.find_even_number(solution.create_fibonacci_upto(4000000))