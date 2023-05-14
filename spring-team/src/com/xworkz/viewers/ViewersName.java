package com.xworkz.viewers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component


public class ViewersName {

	
		@Value("1")
		private int id;
		@Value("mysuru")
		private  String location;



}
