import {
  AfterViewChecked,
  AfterViewInit,
  Component,
  Input,
  OnInit,
} from '@angular/core';
import { Chart } from 'chart.js';
import { PieChartConfig } from '../../utils/chart.config';

@Component({
  selector: 'app-pie-chart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.scss'],
})
export class PieChartComponent implements OnInit, AfterViewInit {
  public chart: any;
  @Input() mid: string = '';
  @Input() config!: PieChartConfig;

  constructor() {}

  ngOnInit(): void {}

  ngAfterViewInit() {
    this.createChart();
  }

  createChart() {
    this.chart = new Chart(this.mid, this.config);
  }
}
