# System requirements

## Java
* Java 16 or newer
* junit-jupiter 5.8.1
* There is a Maven `pom.xml` included in the `java` directory that can be used to build the project. If you're not familiar with maven, you can copy and paste the `.java` files into your IDE of choice and run the unit test manually.

## JavaScript
* node 14
* Run `npm install` from the `javascript` directory

# Nucleus practical coding questions

**Background**

The coding challenge section of the interview involves algorithmic problems that your interviewer will select from the pool below. Answer as many as you can in 45 minutes.

* Empty implementations have been provided for each of the problems.
* Unit tests have been provided for each of the problems.
* Step by step guides for each of the required algorithms have been provided and no prior knowledge is assumed.
* The primary measure of success for each problem is **the problem's unit tests all passing**. I.E. all unit tests passing for one problem is likely to be better than incomplete implementations for multiple problems with failing unit tests.
* Style and best practise will be considered as a secondary measure.

**Getting started**

Your interviewer will select which questions you should attempt, answer any questions you have, and introduce you the IDE / code.

**Checksum**

Write an algorithm that computes the checksum for an array of numbers as follows:

1. given the `seed` is `113`
2. given the `limit` is `10000007`
3. initialise the `result` to `0`
4. start at the beginning of the array of numbers
5. add the member pointed to by the array index to the `result`
6. multiply the `result` by the `seed`
7. set the `result` to the `result` by modulo `limit` (I.E. the remainder of dividing the `result` by the `limit`)
8. increment the index to point to next element of array
9. if the array is not exhausted, return to step 5

**Collatz**

Write an algorithm that solves the Collatz Conjecture and returns the number of iterations taken for a given number.
A Collatz Conjecture is computed by the following formula:

```
if x is even then (x / 2) otherwise (3 * x + 1)
```

1. Given starting value `x`
2. If `x` is `0` or `1` exit returning the number of iterations
3. If `x` is even then set `x` to `(x / 2)` otherwise set `x` to `(3 * x + 1)`
4. Repeat until `x` is `0` or `1`

The result of the formula is fed back into the formula until the formula returns 1. Return the number of iterations taken.

**Staircase**

Write an algorithm that returns a string which represents a staircase such that `staircase(4)` will give the following result:

```
   #
  ##
 ###
####
```
N.B. the last line does not have any cr/lf or spaces.

**Count and sum**

1. Given an array of ints
2. Count the positive numbers
3. Sum the negative numbers
4. Return an int array size 2 with array[0] = count of positive numbers, array[1] = sum the negative numbers

**Mirror**

1. Given an array of chars
2. Return true if the values are mirrored around the centre of the array.
E.G.
'a', 'b', 'a' will return true
'a', 'b', 'b', 'a' will return true
'a', 'b', 'c', 'a' will return false

**Count distinct words**

1. Given a string of words split by the space character
2. Return a map containing each distinct word and the number of occurrences
E.G.
"foo foo bar" will return a map of foo: 2, bar: 1

**Bubble sort**

Write an algorithm that implements a bubble sort and outputs a map containing the following keys:

Bubble sort uses the following algorithm:

1. given an array containing `[5,2,1]`
2. given index `x = 0`
3. if `ary[x] > ary[x+1]` then swap the values
4. Continue to loop through the array until no more swaps occur
5. Return the number of swaps `swaps`, the number of times to loop through the array `itor`, and the sorted array `list`

```
swaps - the total number of swaps that took place
```

```
itor - the total amount of iterations required
```

```
list - the sorted list
```

**Add one**

Write an algorithm that adds one to the input. The input is an array representing an integer (ex: [1,2,3] => 123).

For instance: 

```
[1, 2, 3] => [1, 2, 4]
[1,9] => [2, 0]
```
