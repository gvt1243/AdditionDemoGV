package com.example.demo.AdditionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AddRepository.AdditionRepo;
import com.example.demo.Entities.Addition;


@Service
public class AddService {
	
	@Autowired
	AdditionRepo repository ;
	public int getTotal(Addition addObj)
	{
		int c= addObj.getNum1()+addObj.getNum2();
		addObj.setId(c);
		repository.save(addObj);
		return c ;
	}

}
