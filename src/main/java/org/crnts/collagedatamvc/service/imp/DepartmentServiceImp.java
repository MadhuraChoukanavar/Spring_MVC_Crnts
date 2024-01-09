package org.crnts.collagedatamvc.service.imp;

import org.crnts.collagedatamvc.bean.Department;
import org.crnts.collagedatamvc.entity.DepartmentEntity;
import org.crnts.collagedatamvc.repository.DepartmentRepository;
import org.crnts.collagedatamvc.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class DepartmentServiceImp implements DepartmentService{
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public void save(Department department) {
		DepartmentEntity entity=new DepartmentEntity();
		entity.setdId(department.getdId());
		entity.setdName(department.getdName());
		entity.setdHead(department.getdHead());
		departmentRepository.save(department);
		
	}

}
