import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-view-player',
  templateUrl: './view-player.component.html',
  styleUrls: ['./view-player.component.css']
})
export class ViewPlayerComponent implements OnInit {

  id:number;
  message:string;
   players: Player[];
   players1:Player;
  constructor(private service: PlayerService,private router: Router) {

  }

  ngOnInit() {
    this.refreshPlayer();
  }


  refreshPlayer(){
    this.service.getAllPlayers().subscribe(res => {
      this.players = res;
    })
  }

  public deletePlayer(id){
    console.log(`delete the employee ${id}`);
    
    this.service.deletePlayer(id).subscribe(res=>{
      console.log(res);
      this.message=`player deleted successfully ${id}`;
      this.refreshPlayer();

    
      
      
    })
   

      
 
  }


  savePlayer(players1){
    this.service.updatePlayer(this.players1).subscribe(res=>{
      console.log(res);
      this.router.navigate(['/updatePlayer']);
      
    })
  }


  


}
