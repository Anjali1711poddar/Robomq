import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tables-rec',
  templateUrl: './tables-rec.component.html',
  styleUrls: ['./tables-rec.component.css']
})
export class TablesRecComponent implements OnInit {
  employee: object;
  constructor() { }

  ngOnInit() {
    this.employee = [{ID: 1, NAME: 'anirudh', SALARY: 23000, DEPARTMENT: 'BACKEND' },
 {ID: 2, NAME: 'Suresh', SALARY: 22000, DEPARTMENT: 'UI' },
 {ID: 3, NAME: 'Harshal', SALARY: 22000, DEPARTMENT: 'DEVOPS' },
 {ID: 4, NAME: 'Harish', SALARY: 25000, DEPARTMENT: 'MARKETING' },
 {ID: 5, NAME: 'Kirti', SALARY: 10000, DEPARTMENT: 'HR' },
 {ID: 6, NAME: 'Shubh', SALARY: 22000, DEPARTMENT: 'DESIGN' }];
  }

}
