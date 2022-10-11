import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartapiService {
  cartDataList:any=[];
  productList=new BehaviorSubject<any>([]);
  
  constructor(private http:HttpClient) { }
  getProductData(){
    return this.productList.asObservable();
  }
  setProduct(product:any){
    this.cartDataList.push(...product);
    this.productList.next(product)
  }
  addToCart(product:any){
    this.cartDataList.push(product);
    this.productList.next(this.cartDataList);
    this.getTotalAmount();
    console.log(this.cartDataList)
  }
  //Get Total Amount
  getTotalAmount():any{
    let grandTotal =0;
    this.cartDataList.map((a:any)=>{
      grandTotal +=a.total;
    })
    return grandTotal;

  }
  //Remove Cart Data one by one
  removeCartData(product:any){
    this.cartDataList.map((a:any,index:any)=>{
      if(product.id===a.id){
        this.cartDataList.splice(index,1)
      }
    })
    this.productList.next(this.cartDataList)
  }
  //Remove all cart data
  removeAllCart(){
    this.cartDataList=[]
    this.productList.next(this.cartDataList)
  }

}

