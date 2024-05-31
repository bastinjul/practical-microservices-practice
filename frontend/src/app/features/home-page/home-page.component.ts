import { Component } from '@angular/core';
import {VideoViewsComponent} from "../video-views/video-views.component";

@Component({
  selector: 'app-home-page',
  standalone: true,
  imports: [
    VideoViewsComponent
  ],
  templateUrl: './home-page.component.html',
  styleUrl: './home-page.component.scss'
})
export class HomePageComponent {

}
