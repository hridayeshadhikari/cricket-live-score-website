import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from '../../services/api.service';
import { NgxTypedJsModule } from 'ngx-typed-js';
import { LiveMatchCardComponent } from '../../components/live-match-card/live-match-card.component';

@Component({
  selector: 'app-all-matches',
  standalone: true,
  imports: [CommonModule,NgxTypedJsModule,LiveMatchCardComponent],
  templateUrl: './all-matches.component.html',
  styleUrl: './all-matches.component.css'
})



export class AllMatchesComponent  implements OnInit {
loading=false
  allMatches: any;

  constructor(private _api:ApiService){

  }
  ngOnInit(): void {
   

    this._api.getAllMatches()
    .subscribe({
      next:data=>{
        this.allMatches=data;
        console.log(this.allMatches)
      },
      error:error=>{
        console.log(error)
      }
    })

  }


}
