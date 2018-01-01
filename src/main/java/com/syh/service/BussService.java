package com.syh.service;

import com.syh.pojo.Buss;

public interface BussService {
    public int selBussByName(String buss_name);
    public void addBuss(Buss buss);
}
