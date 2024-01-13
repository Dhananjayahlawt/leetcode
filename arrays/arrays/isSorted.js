let array = [1, 2, 3, 4, 5, 6, 7, 10, 6];
function isSorted(array) {
  let length = array.length;
  for (let index = 0; index < length; index++) {
    if (array[index] > array[index + 1]) {
      return false;
    }
  }
  return true;
}

let result = isSorted(array);
console.log("Is Array Sorted:-", result);


