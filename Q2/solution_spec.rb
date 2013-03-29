require "./solution"

describe "solution's test", "#find_even_number" do
  before { @find_fibonacci = Solution.new }
  
  it "should find even fibonacci numbers" do
    result = @find_fibonacci.find_even_number([1, 2, 3, 5, 8, 13, 21])
    result.should =~ [2, 8]
  end
end

describe "solution", "#create_fibonacci_upto" do
  before { @find_fibonacci = Solution.new }
  
  it "should create fibonacci sequence up to the given number" do
    fibonacci_sequence = @find_fibonacci.create_fibonacci_upto(50)
    fibonacci_sequence.should =~ [1, 2, 3, 5, 8, 13, 21, 34, 55]
  end
end

describe "solution", "#find_sum" do
  before { @find_fibonacci = Solution.new }
  
  it "should add even fibonacci numbers" do
    result = @find_fibonacci.add_even_fibonnaci([2, 8, 34])
    result.should == 44
  end  
end