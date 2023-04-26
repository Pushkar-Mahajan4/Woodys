import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { FirstComponent } from './first/first.component';
import { RegisterComponent } from './register/register.component';
import { ServiceComponent } from './service/service.component';
import { AddvehicleComponent } from './addvehicle/addvehicle.component';
import { MyvehiclesComponent } from './myvehicles/myvehicles.component';
import { CreateappointmentComponent } from './createappointment/createappointment.component';
import { MyappointmentComponent } from './myappointment/myappointment.component';
import { ManagerloginComponent } from './managerlogin/managerlogin.component';
import { HomecomponentComponent } from './homecomponent/homecomponent.component';


const routes: Routes = [
{path: 'login', component: LoginComponent},
{path: 'first', component: FirstComponent},
{path: 'register', component: RegisterComponent},
{path: 'service', component: ServiceComponent},
{path: 'addvehicle', component: AddvehicleComponent},
{path: 'myvehicles', component: MyvehiclesComponent},
{path: 'createappointment', component: CreateappointmentComponent},
{path: 'myappointment', component: MyappointmentComponent},
{path: 'managerlogin', component: ManagerloginComponent},
{path: 'home', component: HomecomponentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
