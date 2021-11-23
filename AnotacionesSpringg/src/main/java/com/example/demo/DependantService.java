package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependantService {
	 @Autowired
	 private  Service1 service1;
	 @Autowired
	 private  Service2 service2;
	
	 
void doSmth() {
	service1.doSmth();
	service2.doSmth();
	}
	/*Constructor
	private  Final Service1 service1;
	private  Final Service2 service2;
	@Autowired
	public DependantService(Service1 service1, Service2 service2) {
		super();
		this.service1 = service1;
		this.service2 = service2;
	}

	
	void doSmth() {
		service1.doSmth();
		service2.doSmth();
	}*/
	
	/*Settle
	public DependantService() {
	
	}
	@Autowired
	 
	public void setService1(Service1 service1) {
		this.service1 = service1;
	}
	
	@Autowired
	public void setService2(Service2 service2) {
		this.service2 = service2;
	}
	 */


	
}

