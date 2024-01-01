function isAnagram(a, b) {
  if (a.length != b.length) {
    return false;
  }
  a.sort();
  b.sort();

  for (let i = 0; i < a.length; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
let str1 = "asd".split("");
let str2 = "dsa".split("");
let result = isAnagramUsingMap(str1, str2);
let result2 = isAnagram(str1, str2);
console.log("is String Anagram using map:- ", result);
console.log("is String Anagram normal:- ", result2);

///// Using Map As it is using o(nlog n ) complexity;

function isAnagramUsingMap(a, b) {
  if (a.length != b.length) {
    return false;
  }
  let map = new Map();
  for (let i = 0; i < a.length; i++) {
    if (map.has(a[i])) {
      map.set(a[i], map.get(a[i]) + 1);
    } else {
      map.set(a[i], 1);
    }
  }
  for (let i = 0; i < b.length; i++) {
    if (map.has(b[i])) {
      map.set(b[i], map.get(b[i]) - 1);
    }
  }
  console.log(map, "MAP");

  let keys = map.keys();
  for (let key of keys) {
    if (map.get(key) != 0) {
      return false;
    }
  }
  return true;
}
