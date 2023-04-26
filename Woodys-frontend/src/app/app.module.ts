import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { ServiceComponent } from './service/service.component';
import { AddvehicleComponent } from './addvehicle/addvehicle.component';
import { MyvehiclesComponent } from './myvehicles/myvehicles.component';
import { CreateappointmentComponent } from './createappointment/createappointment.component';
import { MyappointmentComponent } from './myappointment/myappointment.component';
import { ManagerloginComponent } from './managerlogin/managerlogin.component';
import { HomecomponentComponent } from './homecomponent/homecomponent.component';



@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    LoginComponent,
    RegisterComponent,
    ServiceComponent,
    AddvehicleComponent,
    MyvehiclesComponent,
    CreateappointmentComponent,
    MyappointmentComponent,
    ManagerloginComponent,
    HomecomponentComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
