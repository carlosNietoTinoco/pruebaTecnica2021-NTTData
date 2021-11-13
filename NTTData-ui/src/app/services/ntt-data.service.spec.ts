import { TestBed } from '@angular/core/testing';

import { NttDataService } from './ntt-data.service';

describe('NttDataService', () => {
  let service: NttDataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NttDataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
