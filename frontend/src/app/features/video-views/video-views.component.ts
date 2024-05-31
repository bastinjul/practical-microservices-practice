import { Component } from '@angular/core';

@Component({
  selector: 'app-video-views',
  standalone: true,
  imports: [],
  templateUrl: './video-views.component.html',
  styleUrl: './video-views.component.scss'
})
export class VideoViewsComponent {
  //TODO: fetch video count from backend
  videoCount: number = 0;

  addVideoViewed(): void {
    //TODO: replace by a call to backend
    this.videoCount++;
  }
}
