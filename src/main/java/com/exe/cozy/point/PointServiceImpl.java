package com.exe.cozy.point;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exe.cozy.domain.PointDto;
import com.exe.cozy.mapper.PointMapper;

@Service
public class PointServiceImpl implements PointService{

	@Autowired
	private PointMapper pointMapper;
	
	@Override
	public int maxNum() {
		return pointMapper.maxNum();
	}
	
	@Override
	public void insertData(PointDto dto) {
		pointMapper.insertData(dto);
	}

	@Override
	public List<PointDto> getList(String customerEmail) {
		return pointMapper.getList(customerEmail);
	}

	@Override
	public void deleteData(String customerEmail) {
		pointMapper.deleteData(customerEmail);
	}

	@Override
	public int getTotal(String customerEmail) {
		return pointMapper.getTotal(customerEmail);
	}



}
