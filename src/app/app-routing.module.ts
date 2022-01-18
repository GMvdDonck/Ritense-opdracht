import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {BurgerListComponent} from './components/burger-list/burger-list.component';
import {ToppingsComponent} from './components/toppings/toppings.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'burger-list', component: BurgerListComponent},
  {path: 'toppings', component: ToppingsComponent},
  {path: '**', component: HomeComponent}
]

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {
}
