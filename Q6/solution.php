<?php

class Solution
{
    public function calcSquare($number)
    {
        return $number * $number;
    }
    
    public function squareOfSumOfArrayElements($array)
    {
        return array_sum($array) * array_sum($array);
    }
    
    public function sumOfSquareOfArrayElements($array)
    {
        $callback = function($value){
            return $value * $value;
        };
        return array_sum(array_map($callback, $array));
    }
    
    public function differenceOfSums($array)
    {
        return $this->squareOfSumOfArrayElements($array) - $this->sumOfSquareOfArrayElements($array);
    } 
}

$solution = new Solution();
$array = range(1, 100);
print $solution->differenceOfSums($array)."\n";
?>