import {Component, OnInit} from '@angular/core';
import {Type} from "../../models/Type";
import {Topping} from "../../models/Topping";
import {BurgerService} from "../../services/burger.service";
import {Bread} from "../../models/Bread";
import {Meat} from "../../models/Meat";

@Component({
  selector: 'app-toppings',
  templateUrl: './toppings.component.html',
  styleUrls: ['./toppings.component.css']
})
export class ToppingsComponent implements OnInit {

  // TODO: Add code to make page use selected burger
  // TODO: Make pressed buttons different colour for clarity

  // Data from database to select as options
  selectedBurger: Type = new Type(0, "", 0, "", 0);
  breads: Bread[] = [];
  meats: Meat[] = [];
  toppings: Topping[] = [];

  // Temporary selected data to calculate total price and show selection
  toppingPrice: number = 0;
  toppingsSelected: Topping[] = [];
  toppingsSelectedAmount: number = 0;
  selectedBread: string = "";
  selectedMeat: string = "";


  totalPrice: number = 0;

  // Sets all of the selectable ingredients in the page
  constructor(private burgerService: BurgerService) {
    burgerService.getBurgerTypes().subscribe(
      (types) => {
        this.selectedBurger = types[0];
        this.totalPrice += this.selectedBurger.basePrice;
      });

    burgerService.getBreadTypes().subscribe(
      (breads) => {
        this.breads = breads;
      });

    burgerService.getMeatTypes().subscribe(
      (meats) => {
        this.meats = meats;
      }
    );

    burgerService.getToppings().subscribe(
      (toppings) => {
        this.toppings = toppings;
      });
  }

  ngOnInit(): void {
  }

  // Changes the selected ingredients for the final product
  public onBreadClick(bread: string) {
    this.selectedBread = bread;
  }

  public onMeatClick(meat: string) {
    this.selectedMeat = meat;
  }

  // TODO: Add code to remember what toppings are already selected so they can be changed
  public onToppingClick(topping: Topping) {
    if (this.toppingsSelectedAmount < this.selectedBurger.maxToppings) {
      this.toppingPrice += topping.price;
      this.totalPrice += topping.price;
      this.toppingsSelected.push(topping);

      this.toppingsSelectedAmount++;
    }
  }

}
