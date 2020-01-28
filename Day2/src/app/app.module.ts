import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {
  MatInputModule,
  MatCardModule,
  MatButtonModule,
  MatToolbarModule,
  MatExpansionModule,
} from '@angular/material';

import { AppComponent } from './app.component';
import { EmpCreateComponent } from './Employee/Emp-create/Emp-create.component';
import { HeaderComponent } from './header/header.component';
import { EmpListComponent } from './Employee/Emp-list/Emp-list.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpCreateComponent,
    HeaderComponent,
    EmpListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatCardModule,
    MatButtonModule,
    MatToolbarModule,
    MatExpansionModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
