def find_multiples_of_3_and_5_below(number)
  sum = 0
  number.to_i.times do |current_number|
    if current_number % 3 == 0 || current_number % 5 == 0
      sum += current_number
    end
  end
  puts "#{sum}"  
end

find_multiples_of_3_and_5_below(*ARGV)