package com.example.demo.mapper;

import com.example.demo.bean.Trip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TripMapper {
    List<Trip> selectTrip(String DP,String AP);
}
