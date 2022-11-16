package com.restaurant.foodWala.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.foodWala.dao.MenuItemsDto;
import com.restaurant.foodWala.model.MenuItemsModel;
import com.restaurant.foodWala.service.MenuItemsInterface;

@RestController
@RequestMapping("/res")
public class MenuItemsController {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	MenuItemsInterface menrep;

	public MenuItemsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/addAll")
	public String addItemsControllerAll(@RequestBody List<MenuItemsDto> data) {

		// List<Restaurant> restEntity = (List<Restaurant>) modelMapper.map(data,
		// Restaurant.class);

		Type listType = new TypeToken<List<MenuItemsModel>>() {
		}.getType();
		List<MenuItemsModel> menuEntity = modelMapper.map(data, listType);

		menrep.addAllFoodItems(menuEntity);

		return "added";
	}

	@GetMapping("/fetchById/{id}")
	public MenuItemsModel fetchItemsController(@PathVariable int id) {

		return menrep.fetchById(id);
	}

	@GetMapping("/pagination/{pageno}/{pageSize}")
	public List<MenuItemsModel> paginationController(@PathVariable int pageno, @PathVariable int pageSize) {
		return menrep.pagination(pageno, pageSize);
	}

//	@PostMapping("/addOne")
//	public String addItemsController(@RequestBody MenuItemsDto data) {
//
//		MenuItemsModel menuEntity = modelMapper.map(data, MenuItemsModel.class);
//
//		menrep.addFoodItems(menuEntity);
//
//		return "added";
//	}

	@PostMapping("/addOne")
	public String addItemsController(@RequestBody MenuItemsModel data) {

		menrep.addFoodItems(data);

		return "added";
	}
}
