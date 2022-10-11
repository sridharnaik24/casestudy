import { HttpClient } from '@angular/common/http';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder, Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
public loginForm!:FormGroup
  
constructor(private formBuilder :FormBuilder, private http :HttpClient, private router:Router) { }

  ngOnInit(): void {
    this.loginForm=this.formBuilder.group({
      user_email:['',Validators.required],
      user_password:['',Validators.required]
    })
  }
  login(){
    this.http.get<any>("http://localhost:8085/user")
    .subscribe(res=>{
     const user = res.find((a:any)=>{
      return a.user_email === this.loginForm.value.user_email &&
       a.user_password === this.loginForm.value.user_password
     });
     if(user){ 
   
    this.router.navigateByUrl('products')
    
 
    }else{
      alert("User Not Found")
    }});
  }

}
