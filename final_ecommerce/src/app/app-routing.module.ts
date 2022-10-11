import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './component/cart/cart.component';
import { ProductsComponent } from './component/products/products.component';
import { IndexComponent } from './index/index.component';
import { LoginComponent } from './login/login.component';
import { OderSuccessfulComponent } from './oder-successful/oder-successful.component';
import { OrderComponent } from './order/order.component';
import { SignupComponent } from './signup/signup.component';


const routes: Routes = [
  {path:'', redirectTo:'home',pathMatch:'full'},
  {path:'products', component: ProductsComponent},
  {path:'cart', component: CartComponent},
  {path:'login' , component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'orders',component:OrderComponent},
  {path:'ordersuccess',component:OderSuccessfulComponent},
  {path:'home',component:IndexComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
