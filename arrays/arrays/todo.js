/*
  Implement a class `Todo` having below methods
    - add(todo): adds todo to list of todos
    - remove(indexOfTodo): remove todo from list of todos
    - update(index, updatedTodo): update todo at given index
    - getAll: returns all todos
    - get(indexOfTodo): returns todo at given index
    - clear: deletes all todos

  Once you've implemented the logic, test your code by running
*/

class Todo {
  #todoList;
  constructor() {
    this.#todoList = [];
  }
  add(todo) {
    this.#todoList.push(todo);
  }
  remove(indexOfTodo) {
    if (indexOfTodo >= 0 && indexOfTodo < this.#todoList.length) {
      this.#todoList.splice(indexOfTodo, 1);
    } else {
      console.log("Todo Cannot be replaced because todo does not exist");
    }
  }
  update(index, updatedTodo) {
    this.#todoList[index] = updatedTodo;
  }
  get getTodo() {
    return this.#todoList;
  }
  clear() {
    this.#todoList = [];
  }
}

let todoList = new Todo();
todoList.add("Go to Gym");
console.log(todoList.getTodo);
todoList.add("Take a Bath");
console.log(todoList.getTodo);
todoList.update(1,"Coming from gym");
console.log(todoList.getTodo);
