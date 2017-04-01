import {Component} from '@angular/core';
import {PostsService} from './posts.service';

@Component({
    selector: 'user',
    templateUrl: './user.component.html',
    providers: [PostsService]
})

export class UserComponent{
    name: string;
    email: string;
    address: address;
    hobbies: string[];
    showHobbies: boolean;
    posts: Posts[];

    constructor(private postsService: PostsService){
        this.name = 'ddulh';
        this.email = 'ddulhddul@gmail.com';
        this.address = {
            street: '12 main st',
            city: 'Sillim',
            state: 'Seoul'
        }
        this.hobbies = ['music','movie','sports'];
        this.showHobbies = true;
        this.postsService.getPosts().subscribe(posts => {
            console.log(posts);
            this.posts = posts;
        })
    }

    toggleHobbies(){
        this.showHobbies = !this.showHobbies;
    }

    deleteHobby(index: number){
        this.hobbies.splice(index, 1);
    }

    addHobby(hobby: string){
        this.hobbies.push(hobby);
    }
}
interface address{
    street: string;
    city: string;
    state: string;
}

interface Posts{
    id: number;
    title: string;
    body: string;
}