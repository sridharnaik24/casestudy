import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/service/cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
 
  public products : any = [];
  public grandTotal : number=0;

  quantity:number=1;
  Total:number=0;
  a: number=1;

 
  constructor(private cartService : CartService) { }

  ngOnInit(): void {
   
    this.cartService.getProducts()
    .subscribe(res=>{
      this.products = res;
      this.grandTotal = this.cartService.getTotalPrice();
    })
  }
  removeItem(item: any){
    this.cartService.removeCartItem(item);
  }
  emptycart(){
    this.cartService.removeAllCart();
  }
 
  
    plus(item:any){
    
      item.prodPrice=(item.prodQuantity+1)*item.prodPrice;
  
    
 
  }
  getgrandTotal(item:any):number{
    this.grandTotal=(this.products.producePrice)*item.prodQuantity;
    console.log(this.grandTotal);
    return <number>this.grandTotal;
    
    
  }
}




