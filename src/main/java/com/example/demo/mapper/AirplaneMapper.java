package com.example.demo.mapper;


import com.example.demo.bean.Airplane;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AirplaneMapper {
    List<Airplane> selectAirplane(int id);
}
