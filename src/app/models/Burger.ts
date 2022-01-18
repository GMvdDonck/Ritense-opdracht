import {Type} from "./Type"
import {Bread} from "./Bread"
import {Meat} from "./Meat"
import {Topping} from "./Topping";


// Class only useful for a finished application (to combine all ingredients in 1 for the order itself)
export class Burger {
  constructor(public id: number, public type: Type, public bread: Bread, public meat: Meat, public toppings: Array<Topping>) {
  }
}
