import {
  AfterContentChecked,
  AfterContentInit,
  Component,
  OnInit,
} from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.scss'],
})
export class LayoutComponent implements OnInit, AfterContentChecked {
  neutralBackground = true;

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {}

  ngAfterContentChecked(): void {
    const subs$ = this.route.children[0].data.subscribe((data) => {
      console.log(data);
      if (data['backgroundNeutral']) {
        this.changeBackgroundColor('neutral');
      } else {
        this.changeBackgroundColor('white');
      }
    });
  }
  changeBackgroundColor(color: 'neutral' | 'white') {
    if (color === 'neutral') {
      this.neutralBackground = true;
    } else {
      this.neutralBackground = false;
    }
  }
}
