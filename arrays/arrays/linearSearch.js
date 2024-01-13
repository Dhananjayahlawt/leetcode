let array = [1, 2, 3, 4, 5, 2, 3, 5, 6, 7, 8, 3];
let search = 1;
function linearSearch(array, search) {
  for (let index in array) {
    if (array[index] === search) {
      return index;
    }
  }
  return -1;
}

let result = linearSearch(array, search);
console.log(`the index of ${search} is :${result}`);
