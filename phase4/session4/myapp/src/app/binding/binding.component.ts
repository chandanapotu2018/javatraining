import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  name:string="Chndana Potu";
  url:string ="https://www.google.com";

  products=[{name:"pencile",price:"8.3",available:"06-05-2022",ratings:4.8},
  {name:"pen",price:"10",available:"10-05-2022",ratings:4.8},
  {name:"eraser",price:"5.5",available:"06-06-2022",ratings:4.8},
  {name:"scale",price:"8",available:"19-05-2022",ratings:4.8},
  {name:"strencil",price:"15",available:"31-05-2022",ratings:4.8},
  ]

}