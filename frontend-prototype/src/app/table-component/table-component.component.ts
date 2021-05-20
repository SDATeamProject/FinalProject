import {Component, OnInit} from '@angular/core';
import {TableServiceService} from "../table-service.service";

@Component({
  selector: 'app-table-component',
  templateUrl: './table-component.component.html',
  styleUrls: ['./table-component.component.css']
})
export class TableComponentComponent implements OnInit {
  tables: Array<any> | undefined;

  constructor(private tableServiceService: TableServiceService) {
  }

  ngOnInit(): void {
    this.tableServiceService.getAll().subscribe(data => this.tables = data);
  }

}
