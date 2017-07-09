import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RedditService } from '../../app/services/reddits.service';
import { RedditsPage } from '../reddits/reddits';

@Component({
  selector: 'setting',
  templateUrl: 'setting.html'
})
export class SettingPage {
  items: any;
  category: any;
  limit: any;

  constructor(public navCtrl: NavController, private redditService: RedditService) {
    if(localStorage.getItem('category')){
      this.category = localStorage.getItem('category');
      this.limit = localStorage.getItem('limit');
    }else{
      this.category = 'sports';
      this.limit = 10;
    }
  }

  setDefaults(){
    localStorage.setItem('category', this.category);
    localStorage.setItem('limit', this.limit);
    this.navCtrl.push(RedditsPage)
  }

}
