// /*
// You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
// The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
// Return the minimum number of operations needed to make s alternating.

// Input: s = "0100"
// Output: 1
// Explanation: If you change the last character to '1', s will be "0101", which is alternating.


// leetCode Link:- https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/
// */

// let s = "01010111";
// function minimumChanges(s) {
//   let length = s.length;
//   let odd = true; //start with 1;
//   let numberOfOneUpdated = 0;
//   let numberOfZerosUpdated = 0;
//   for (let i = 0; i < length; i++) {
//     if (s.at(i) === "0") {
//       if (odd) {
//         numberOfOneUpdated++;
//       } else {
//         numberOfZerosUpdated++;
//       }
//     } else {
//       if (odd) {
//         numberOfZerosUpdated++;
//       } else {
//         numberOfOneUpdated++;
//       }
//     }
//     odd = !odd;
//   }
//   return Math.min(numberOfOneUpdated, numberOfZerosUpdated);
// }
// let result = minimumChanges(s);
// console.log(result);


let isOpen=false;
const sample={
  abc:true,
  xya:false
}
let result={
  ...(isOpen&&sample)
}

result={...(false)}
console.log(result)