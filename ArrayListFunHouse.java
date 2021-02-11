//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //Instantiate arraylist of Integers called factorList
  ArrayList<Integer> factorList = new ArrayList<Integer>();
  //For loop: initialize loop control variable integer i to 2, condition - i is less than number (parameter), i increments by 1 each iteration
  for(int i = 2; i < number; i++)
  {
    //if the remainder of the the number divided by i is equal to 0 (using modulus: %)
    if(number % i == 0)
      //add i to the arraylist factorList
      factorList.add(i);
  }
  //Return arraylist factorList
  return factorList;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //instantiate arraylist of Integers called factors
   ArrayList<Integer> factors = new ArrayList<Integer>();
   //For loop: initialize loop control variable Integer i to the arraylist (parameter) nums’s size - 1, condition - i is greater than or equal to 0, have i decrement by 1
   for(int i = nums.size()-1; i >= 0; i--)
   {
     //Set factors equal to getListOfFactors of the Integer at index i of nums
     factors = getListOfFactors(nums.get(i));
     //if the size of factors is equal to 0
     if(factors.size() == 0)
      //remove i from the arraylist nums
      nums.remove(i);
   }	
 }
}