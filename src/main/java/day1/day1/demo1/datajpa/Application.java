package day1.day1.demo1.datajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.datajpa.model.Dept;
import com.repositary.DeptRepo;

@SpringBootApplication(scanBasePackages="com.repositary")
@EnableJpaRepositories(basePackages="com.repositary")
@EntityScan(basePackages="com.datajpa.model")
public class Application {

	public static void main(String[] args) {
		ApplicationContext app=SpringApplication.run(Application.class, args);
		DeptRepo repo=app.getBean(DeptRepo.class);
	/*	for(int i=10;i<100;i+=10){
			Dept d=new Dept();
			d.setDeptno(i);
			d.setDname("Dname"+i);
			if(i%20==0){
				d.setLoc("Pune");
			}
			else{
				d.setLoc("mumbai");
			}
			repo.save(d);
			
		}
		repo.findAll().forEach((e)->System.out.println(e));
		Dept d=new Dept(20,"HR","Bihar");
		repo.save(d);
		repo.delete(d);
		repo.findAll().forEach((e)->System.out.println(e));*/
		System.out.println("hi ");
		repo.findByDname("Dname30").forEach((e)->System.out.println(e));
	}
	@Bean
	public String test(DeptRepo repo){
		repo.findByDname("Dname30").forEach((e)->System.out.println(e));
		return "success";
		
	}
}
