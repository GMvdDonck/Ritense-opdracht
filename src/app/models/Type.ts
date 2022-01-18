// export enum Type {
//   Basic = "Basic",
//   Healthy = "Healthy",
//   Combo = "Combo"
// }

export class Type {
  constructor(public id: number, public name: string, public maxToppings: number, public extras: string, public basePrice: number) {
  }
}
