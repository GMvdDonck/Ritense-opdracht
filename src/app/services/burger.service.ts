import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Type} from "../models/Type";
import {Bread} from "../models/Bread";
import {Meat} from "../models/Meat";
import {Topping} from "../models/Topping";

@Injectable({
  providedIn: 'root'
})
export class BurgerService {

  // URL of Spring database
  baseUrl: string = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) {
  }

  // Getters for all of the ingredient data from the database
  public getBurgerTypes() {
    return this.httpClient.get<Type[]>(`${this.baseUrl}/types`);
  }

  public getBreadTypes() {
    return this.httpClient.get<Bread[]>(`${this.baseUrl}/bread`);
  }

  public getMeatTypes() {
    return this.httpClient.get<Meat[]>(`${this.baseUrl}/meat`);
  }

  public getToppings() {
    return this.httpClient.get<Topping[]>(`${this.baseUrl}/toppings`);
  }
}
