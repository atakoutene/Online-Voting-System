export interface PieChartConfig {
  type: "pie" | "dougnut";
  data: {
    labels: string[];
    datasets: [
      {
        label: string;
        data: number[];
        backgroundColor: string[];
      }
    ];
  };
  options?: any;
}
