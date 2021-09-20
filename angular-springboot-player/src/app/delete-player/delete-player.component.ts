import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../player.service';
import { Router } from '@angular/router';
import { Player } from '../player';

@Component({
  selector: 'app-delete-player',
  templateUrl: './delete-player.component.html',
  styleUrls: ['./delete-player.component.css']
})
export class DeletePlayerComponent  {
  private player: Player;
  id:number;
  message:string;
  constructor(private service: PlayerService, private router: Router) {
    this.player = new Player();
   }

  

  // public deletePlayer(id){
  //   console.log('delete the employee');
    
  //   this.service.deletePlayer(id).subscribe(res=>{
  //     console.log(res);
  //     this.message=`player deleted successfully ${id}`;
  //     console.log(id);
   
      
      
  //   })
   

      
 
  }






