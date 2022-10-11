import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OderSuccessfulComponent } from './oder-successful.component';

describe('OderSuccessfulComponent', () => {
  let component: OderSuccessfulComponent;
  let fixture: ComponentFixture<OderSuccessfulComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OderSuccessfulComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OderSuccessfulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
