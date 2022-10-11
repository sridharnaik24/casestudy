import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../service/api.service';
import { CartService } from '../service/cart.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.scss']
})
export class IndexComponent implements OnInit {

  public productList : any;
  public filterCategory : any
  searchKey:string ="";

  constructor(private api : ApiService, private cartService : CartService,private router:Router) { }

  ngOnInit(): void {
    this.api.getProduct()
    .subscribe((res: any)=>{
      this.productList = res;
      this.filterCategory = res;
      this.productList.forEach((a:any) => {
        if(a.category ==="women's clothing" || a.category ==="men's clothing"){
          a.category ="fashion"
        }
        Object.assign(a,{quantity:1,total:a.price});
      });
      console.log(this.productList)
    });

    this.cartService.search.subscribe((val:any)=>{
      this.searchKey = val;
    })
  }
  addtocart(item: any){
    this.router.navigateByUrl('login')
  }
  filter(prodCategory:string){
    this.filterCategory = this.productList
    .filter((a:any)=>{
      if(a.prodCategory == prodCategory || prodCategory==''){
        return a;
      }
    })
  }


}
