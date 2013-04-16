<?php

require_once dirname(__FILE__) . '/solution.php';

class SolutionTest extends PHPUnit_Framework_TestCase
{
    
    public function testCalculateSquareOfNumber_1()
    {
        $solution = new Solution();
        $expected = 1;
        $actual = $solution->calcSquare(1);
        $this->assertEquals($expected, $actual);
    }
    
    public function testCalculateSquareOfNumber_2()
    {
        $solution = new Solution();
        $expected = 4;
        $actual = $solution->calcSquare(2);
        $this->assertEquals($expected, $actual);
    }
    
    public function testCalculateSquareOfNumber_20()
    {
        $solution = new Solution();
        $expected = 400;
        $actual = $solution->calcSquare(20);
        $this->assertEquals($expected, $actual);
    }
    
    public function testSquareOfSumOfArrayElements()
    {
        $solution = new Solution();
        $elements = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        $expected = 3025;
        $actual = $solution->squareOfSumOfArrayElements($elements);
        $this->assertEquals($expected, $actual);
    }
    
    public function testSumOfSquareOfArrayElemets()
    {
        $solution = new Solution();
        $elements = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        $expected = 385;
        $actual = $solution->sumOfSquareOfArrayElements($elements);
        $this->assertEquals($expected, $actual);
    }
    
    public function testDifferenceOfSums()
    {
        $solution = new Solution();
        $elements = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        $expected = 2640;
        $actual = $solution->differenceOfSums($elements);
        $this->assertEquals($expected, $actual);
    }
}
  
?>