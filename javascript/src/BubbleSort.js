// Write an algorithm that implements a bubble sort and outputs a map containing the following keys:
// Bubble sort uses the following algorithm:

// 1. given an array containing [5,2,1]
// 2. given index x = 0
// 3. if ary[x] > ary[x+1] then swap the values
// 4. Continue to loop through the array until no more swaps occur
// 5. Return the number of swaps "swaps", the number of times to loop through the array "itor", and the sorted array "list"

// swaps - the total number of swaps that took place
// itor - the total amount of iterations required
// list - the sorted list

export function sort(listOfNumbers) {
  let swapcount = 0;
  let iterations = 0;

  return { itor: iterations, swaps: swapcount, list: listOfNumbers };
}
