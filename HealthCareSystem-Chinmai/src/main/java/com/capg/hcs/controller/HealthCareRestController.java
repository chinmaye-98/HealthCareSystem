package com.capg.hcs.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capg.hcs.entity.DiagnosticCenterBean;
import com.capg.hcs.service.HealthCareServiceImpl;



@RestController
public class HealthCareRestController {
	
	@Autowired
	HealthCareServiceImpl hcsi;
	
	 @GetMapping("/healthcare/add")
	 public String addCenter(@RequestBody DiagnosticCenterBean center) {
			DiagnosticCenterBean dc = hcsi.addCenter(center);
			return "Center added successfully with id:"+ dc.getCenter_id();
		}
	 
	 
	 @GetMapping("/healthcare/display")      
		public List<DiagnosticCenterBean> displayCenter() {

			List<DiagnosticCenterBean> center = hcsi.displaycenter();
			return  center;
		}

	 
	 
}
