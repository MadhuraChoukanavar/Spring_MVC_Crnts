package org.crnts.collagedatamvc.repository;

import javax.transaction.Transactional;

import org.crnts.collagedatamvc.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DepartmentRepository {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void save(Department department) {
		
		hibernateTemplate.save(department);
	}

}
