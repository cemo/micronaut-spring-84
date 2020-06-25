package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class RegionServicee {

  RegionRepository regionRepository;

  public RegionServicee(RegionRepository regionRepository) {
    this.regionRepository = regionRepository;
    regionRepository.count();
  }
}
