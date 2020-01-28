import { Component, EventEmitter, Output } from '@angular/core';
import { NgForm } from '@angular/forms';



@Component({
  selector: 'app-Emp-create',
  templateUrl: './Emp-create.component.html',
  styleUrls: ['./Emp-create.component.css']
})
export class EmpCreateComponent {
  enteredId = '';
  enteredName = '';
   enteredSalary = '';
   enteredDepartment = '';
  @Output() EmpCreated = new EventEmitter();

  onAddPost() {
    const post = {
      Id: this.enteredId,
      Name: this.enteredName,
       Salary: this.enteredSalary,
      Department: this.enteredDepartment,
    };
    this.EmpCreated.emit(post);
  }

}
