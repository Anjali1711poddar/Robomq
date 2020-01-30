import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
 selector: 'app-login',
 templateUrl: './login.component.html',
 styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 loginForm: FormGroup;
 submitted = false;
 invalidLogin = false;
 constructor(private formBuilder: FormBuilder) { }
 onSubmit() {
 this.submitted = true;
 if (this.loginForm.invalid) {
 console.log('Form invalid');
 return;
 }
 if (this.loginForm.controls.email.value === 'anjalipoddar.com' && this.loginForm.controls.password.value === '1234') {
 window.alert('Login is successful');
 console.log('login is successful');
 } else {
 this.invalidLogin = true;
 console.log('Invalid details');
 }
 }

 ngOnInit() {
 this.loginForm = this.formBuilder.group({
 emailid: ['', Validators.required],
 password : ['', Validators.required],

 });
 }

}
