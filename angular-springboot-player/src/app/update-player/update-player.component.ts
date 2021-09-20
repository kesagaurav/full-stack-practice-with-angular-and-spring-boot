import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent implements OnInit {


  player:Player;
  constructor(private service: PlayerService, private router: Router) { }

  ngOnInit() {
  }


playerToUpdate={
  name:"",
  age:"",
  gender:"",
  city:""
};

  savePlayer(player){
 
    this.service.updatePlayer(this.player).subscribe(res=>{
      console.log(res);
      this.router.navigate(['/viewPlayers']);
      
    })
  }

  

}
