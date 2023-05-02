package com.xworkz.terminal.terminal.dto;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TerminalDTO implements Serializable,Comparable<TerminalDTO> {
	
    private String name;
	private int id;
	private String location;
	
	//Sop replaced by this
	

	@Override
	public int compareTo(TerminalDTO o) {
		
		return o.getId()-o.getId();
	}

	

	/*public Terminal()
	{
	this.name =name;
	this.id =id;
	this.number=number;

	}*/
}

/*public void setName(String name )
{
	this.name ;
}

public String getName()
{
	return name;
}
public void setId(int id)
{
	this.id;
}
public int getId()
{
	return id;
}
public void setNumber(int number)
{
	this.number ;
}
public int getNumber()
{
	return number;
}
}*/
	
