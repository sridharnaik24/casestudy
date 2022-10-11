import { HttpClient } from '@angular/common/http';
import { Placeholder } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Order } from '../Order';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.scss']
})
export class OrderComponent implements OnInit {
  order=new Order;
  msg='';

  constructor(private _service: OrderService,private http:HttpClient,private router:Router) { }



ngOnInit(): void {
}
placeOrder(){
  this._service.placeOrder(this.order).subscribe(
    data=>{
      console.log("response recieved");
      this.msg="order success";
      if(true){
      this.router.navigateByUrl('ordersuccess')
      }
    },error=>{
      console.log("exception occured");
      this.msg=error.error;
    }
  )

    }
  }
