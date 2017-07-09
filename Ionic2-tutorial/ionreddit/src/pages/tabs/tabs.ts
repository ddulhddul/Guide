import { Component } from '@angular/core';

import { RedditsPage } from '../reddits/reddits';
import { AboutPage } from '../about/about';
import { SettingPage } from '../settings/setting';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {
  // this tells the tabs component which Pages
  // should be each tab's root Page
  tab1Root: any = RedditsPage;
  tab2Root: any = SettingPage;
  tab3Root: any = AboutPage;

  constructor() {

  }
}
