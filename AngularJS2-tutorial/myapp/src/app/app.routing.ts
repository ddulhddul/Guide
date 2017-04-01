import {ModuleWithProviders} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import {UserComponent} from './user.component';
import {AboutComponent} from './about.component';

const appRoutes = [
    {
        path: '',
        component: UserComponent
    },
    {
        path: 'about',
        component: AboutComponent
    }
]

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);