import {Component, OnInit} from '@angular/core';
import {BurgerService} from "../../services/burger.service";
import {Type} from "../../models/Type";

@Component({
  selector: 'app-burger-list',
  templateUrl: './burger-list.component.html',
  styleUrls: ['./burger-list.component.css']
})
export class BurgerListComponent implements OnInit {

  // TODO: Add code to make next page remember selected type

  burgers: Type[] = [];

  constructor(private burgerService: BurgerService) {
    burgerService.getBurgerTypes().subscribe(
      (types) => {
        this.burgers = types;
      });
  }

  ngOnInit(): void {

  }

}
