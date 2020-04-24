package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.DiagnosticCenterBean;

@Service
public class HealthCareServiceImpl implements IHealthCareService {
	
	@Autowired
	IHealthCareDao dao;
	
	@Override
	public DiagnosticCenterBean addCenter(DiagnosticCenterBean center) {
		
		return dao.addCenter(center);
	}
	

	

	@Override
	public List<DiagnosticCenterBean> displaycenter() {
		
		return dao.displaycenter();
	}

	
	
	

}
