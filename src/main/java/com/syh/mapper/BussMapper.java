package com.syh.mapper;

import com.syh.pojo.Buss;

import java.util.List;

public interface BussMapper {
    public int selBussByName(String buss_name);
    public void addBuss(Buss buss);
    public List<Buss> selAllBuss();
}
