package io.github.sam11238902.arquiteturaSpringBoot.manfactures.manufacturesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.Brand;
import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.Television;
import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.TelevisionControl;
import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.TypeScreen;

@RestController
public class TelevisionController {
	
	@Autowired
	@Qualifier(value = "typeLed")
	TypeScreen typeLed;
	
	
	@Autowired
	@Qualifier(value = "typeLcd")
	TypeScreen typeLcd;
	
	Television t2 = new Television("Tv Sensacional", Brand.LG, typeLed);
	
	Television t3 = new Television("Tv Sensacional", Brand.LG, typeLcd);
	
	
	@PostMapping("/turnTv")
	public String turnTv(@RequestBody TelevisionControl televisionControll) {
		Television t1 = new Television("Tv Sensacional", Brand.LG, typeLed);
		return t1.turnOnTV(televisionControll);
	
	
	}
}
