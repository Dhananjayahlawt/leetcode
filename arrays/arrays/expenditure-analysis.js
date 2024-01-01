/*
  Implement a function `calculateTotalSpentByCategory` which takes a list of transactions as parameter
  and return a list of objects where each object is unique category-wise and has total price spent as its value.
  transactions is an array where each
  Transaction - an object like 
        {
		id: 1,
		timestamp: 1656076800000,
		price: 10,
		category: 'Food',
		itemName: 'Pizza',
	}
  Output - [{ category: 'Food', totalSpent: 10 }] // Can have multiple categories, only one example is mentioned here
*/

let transactions = [
  {
    id: 1,
    timestamp: 1656076800000,
    price: 10,
    category: "Food",
    itemName: "Pizza",
  },
  {
    id: 1,
    timestamp: 1656076800000,
    price: 20,
    category: "Food",
    itemName: "Pizza",
  },
  {
    id: 1,
    timestamp: 1656076800000,
    price: 50,
    category: "Cloths",
    itemName: "jeans",
  },
];

let filterArray = {};

transactions.forEach((transaction) => {
  let { category, price } = transaction;
  if (filterArray[category]) {
    filterArray[category].totalPrice += price;
  } else {
    filterArray[category] = {
      category: category,
      totalPrice: price,
    };
  }
});

let result = Object.values(filterArray);
console.log(result);
