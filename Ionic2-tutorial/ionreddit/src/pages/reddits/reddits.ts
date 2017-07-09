import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RedditService } from '../../app/services/reddits.service';
import { DetailsPage } from '../details/details';

@Component({
  selector: 'reddits',
  templateUrl: 'reddits.html'
})
export class RedditsPage {
  items: any;
  category: any;
  limit: any;

  constructor(public navCtrl: NavController, private redditService: RedditService) {
    this.setDefaults();  
  }

  ngOnInit(){
      this.getPosts(this.category, this.limit);
  }

  setDefaults(){
    if(localStorage.getItem('category')){
      this.category = localStorage.getItem('category');
      this.limit = localStorage.getItem('limit');
    }else{
      this.category = 'sports';
      this.limit = 10;
    }
  }
  
  getPosts(category, limit){
      this.redditService.getPosts(category, limit).subscribe(response => {
          this.items = response.data.children;
      });
  }

  viewItem(item){
    this.navCtrl.push(DetailsPage, {
        item: item
    });
  }

  changeCategory(){
    this.getPosts(this.category, this.limit);
  }
}
