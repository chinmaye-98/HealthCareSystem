package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.DiagnosticCenterBean;

public interface IHealthCareDao {
	public DiagnosticCenterBean addCenter(DiagnosticCenterBean center);
	 public List<DiagnosticCenterBean >displaycenter();

}
