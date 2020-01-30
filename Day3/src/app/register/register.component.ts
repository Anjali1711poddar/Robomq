import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';

@Component({
 selector: 'app-register',
 templateUrl: './register.component.html',
 styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 registerForm: FormGroup;
 submitted = false;
 invalidRegister = false;

 constructor(private formBuilder: FormBuilder, private router: Router) { }

 onSubmit() {
 this.submitted = true;
 if (this.registerForm.invalid) {
  console.log('Form invalid');
  return;
  } else
  {
  this.invalidRegister = true;
  console.log('Registered');
  this.router.navigateByUrl('/Login');
  }
  }
  ngOnInit() {
  this.registerForm = this.formBuilder.group({
  id : ['', Validators.required],
  Name: [],
  emailid: ['', Validators.required],
  // tslint:disable-next-line: max-line-length
  password : ['', Validators.required , Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}$')],
  mobileno : ['', Validators.required],
  });
  }

 }
