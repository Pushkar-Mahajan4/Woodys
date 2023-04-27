import { Component } from "@angular/core";
import { NgForm } from "@angular/forms";

@Component({
  selector: "app-first",
  templateUrl: "./first.component.html",
  styleUrls: ["./first.component.css"],
})
export class FirstComponent {
  status: string = "";
  vehicle_number: string = "";
  service: string = "";
  new_price: string = "";
  start_date: string = "";
  end_date: string = "";
  responseData: string = "";
  async onSubmitService(services: any) {
    console.log(services.value);
    try {
      const response = await fetch("http://localhost:8081/update/price", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(services.value),
      });
      const data = await response.text();
      console.log(data);
      this.responseData = data;
    } catch (error) {
      console.error(error);
    }
  }

  onSubmitTransaction(transaction: NgForm) {
    console.log("TRANSACTION: " + transaction.value);
    console.log(transaction.value);
  }
  onSubmitStatus(f: NgForm) {
    console.log("STATUS: ");
    console.log(f.value);
  }
}
