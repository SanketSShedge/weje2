package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.student.StudentBean;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		
//		StudentBean studentBean = (StudentBean) context.getBean("student1");
//		System.out.println(studentBean);
		
//		StudentBean studentBean = context.getBean(StudentBean.class);
//		System.out.println(studentBean);
		
		StudentBean studentBean = (StudentBean) context.getBean("student2");
		System.out.println(studentBean);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
