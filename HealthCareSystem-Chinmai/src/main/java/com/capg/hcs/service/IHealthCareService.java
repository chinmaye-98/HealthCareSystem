package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.DiagnosticCenterBean;

public interface IHealthCareService {
	public DiagnosticCenterBean addCenter(DiagnosticCenterBean center);
	public List<DiagnosticCenterBean> displaycenter();

}
