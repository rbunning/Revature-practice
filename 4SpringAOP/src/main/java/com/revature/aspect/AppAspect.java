package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.service.*;

@Aspect
@Component//("appAspect")
public class AppAspect {
	
	@Before("within(com.revature.service.AppService+)")
	public void highjackPlays(JoinPoint jp) {
		System.out.println();
		System.out.println("before service method: " + jp.getSignature().getName());
	}
	
	@Before("within(com.revature.dao.DAO+)")
	public void highjackPlays2(JoinPoint jp) {
		System.out.println();
		System.out.println("before dao method: " + jp.getSignature().getName());
	}
	
}
