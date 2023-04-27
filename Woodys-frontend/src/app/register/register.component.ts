import { Component } from "@angular/core";
import { NgForm } from "@angular/forms";

@Component({
  selector: "app-register",
  templateUrl: "./register.component.html",
  styleUrls: ["./register.component.css"],
})
export class RegisterComponent {
  name: string = "";
  email: string = "";
  address: string = "";
  password: string = "";
  phoneNumber: string = "";
  responseData: string = "";
  async onSubmit(f: NgForm) {
    try {
      const response = await fetch("http://localhost:8081", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(f.value),
      });
      const data = await response.text();
      console.log(data);
      this.responseData = data;
    } catch (error) {
      console.error(error);
    }
  }
}
