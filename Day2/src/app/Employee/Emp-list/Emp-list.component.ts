import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-Emp-list',
  templateUrl: './Emp-list.component.html',
  styleUrls: ['./Emp-list.component.css']
})
export class EmpListComponent {
  displayedColumns: string[] = ['Id', 'Name', 'Salary','Department'];

  @Input() posts = [];
    element  = this.posts;
datasource = this.element;

}
