package com.xworkz.sweetsapp.teashop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.sweetsapp.category.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Data

@Component
public class TeaShop {

	@Autowired
	private List<Category> category;



}
