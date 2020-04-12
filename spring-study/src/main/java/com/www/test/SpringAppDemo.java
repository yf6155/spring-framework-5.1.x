package com.www.test;

import com.www.config.AppConfig;
import com.www.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Application Name : SpringAppDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.11 14:09
 * @Version : v1.0
 */
public class SpringAppDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
		dao.query();
	}

}
