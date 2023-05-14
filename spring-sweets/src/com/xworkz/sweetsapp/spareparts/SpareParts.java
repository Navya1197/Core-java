package com.xworkz.sweetsapp.spareparts;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.sweetsapp.automobile.Automobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data

@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
@NoArgsConstructor


public class SpareParts {


	

		/*public SpareParts()
		{
			System.out.println(this.getClass().getSimpleName()+" object is created");
		}*/

		private int id;
		private String name;
		 


}
