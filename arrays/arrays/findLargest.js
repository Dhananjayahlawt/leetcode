/*
  Write a function `findLargestElement` that takes an array of numbers and returns the largest element.
  Example:
  - Input: [3, 7, 2, 9, 1]
  - Output: 9
*/

// Time complecity of this solution is  o(nlogn) beacuase of sorting
function findLargestElementUsingSort(array) {
  array.sort();
  return array[array.length - 1];
}

let array = [3, 7, 2, 9, 1];

let result = findLargestElement(array);
console.log("The maximum Number in te array is:-", result);

//By Using this method we can solve this problem in o(n)
function findLargestElement(array) {
  let max = -10000;
  for (let element of array) {
    if (max < element) {
      max = element;
    }
  }
  return max;
}
