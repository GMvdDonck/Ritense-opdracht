// export enum Topping {
//   Cheese = "Cheese",
//   Ketchup = "Ketchup",
//   Lettuce = "Lettuce",
//   Tomato = "Tomato",
//   Onion = "Onion",
//   Pickles = "Pickles"
// }

export class Topping {
  constructor(public id: number, public type: string, public price: number) {
  }
}
