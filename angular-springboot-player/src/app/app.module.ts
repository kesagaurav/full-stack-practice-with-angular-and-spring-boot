import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPlayerComponent } from './add-player/add-player.component';
import { DeletePlayerComponent } from './delete-player/delete-player.component';
import { UpdatePlayerComponent } from './update-player/update-player.component';
import { ViewPlayerComponent } from './view-player/view-player.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PlayerService } from './player.service';


@NgModule({
  declarations: [
    AppComponent,
    AddPlayerComponent,
    DeletePlayerComponent,
    UpdatePlayerComponent,
    ViewPlayerComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
