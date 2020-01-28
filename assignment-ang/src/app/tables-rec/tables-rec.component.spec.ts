import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TablesRecComponent } from './tables-rec.component';

describe('TablesRecComponent', () => {
  let component: TablesRecComponent;
  let fixture: ComponentFixture<TablesRecComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TablesRecComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TablesRecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
