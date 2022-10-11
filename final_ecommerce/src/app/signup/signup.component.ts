import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private http:HttpClient,private router:Router) { }
onSubmit(data:any){
  this.http.post('http://localhost:8085/user',data)
  .subscribe((result)=>{
    console.log(result)
    
      this.router.navigate(['login']);
  })
}
  ngOnInit(): void {
  }

}

