import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PieChartConfig } from 'src/app/utils/chart.config';

@Component({
  selector: 'app-election',
  templateUrl: './election.component.html',
  styleUrls: ['./election.component.scss'],
})
export class ElectionComponent implements OnInit {
  electionsData: PieChartConfig[] = [
    {
      type: 'pie',
      data: {
        labels: ['Male', 'Female'],
        datasets: [
          {
            label: 'Number of voters',
            data: [50, 100],
            backgroundColor: ['#403294', '#8878d9'],
          },
        ],
      },
      options: {
        legend: {
          display: false,
        },
      },
    },
    {
      type: 'pie',
      data: {
        labels: ['Male', 'Female'],
        datasets: [
          {
            label: 'Number of voters',
            data: [50, 100],
            backgroundColor: ['#403294', '#8878d9'],
          },
        ],
      },
      options: {
        legend: {
          display: false,
        },
      },
    },
  ];
  constructor(private router: Router, private route: ActivatedRoute) {}

  ngOnInit(): void {}

  chooseUserType() {
    this.router.navigate(['./choose-user-type'], { relativeTo: this.route });
  }
}
