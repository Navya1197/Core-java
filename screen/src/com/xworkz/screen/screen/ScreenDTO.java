package com.xworkz.screen.screen;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class ScreenDTO implements Serializable,Comparable<ScreenDTO> {
	private String screenName;
	private String screenCity;
	private int screenNumber;

//Sop replaced by this
@Override
public String toString()
{
return "Screen(screenName="+this.screenName+", screenCity="+this.screenCity+" ,screenNumber="+this.screenNumber+")";
}

@Override
public int compareTo(ScreenDTO o) {
	// TODO Auto-generated method stub
	return o.getScreenNumber()-o.getScreenNumber();
}
}

/*public Screen(String name,String city,int number)
{
this.screenName =name;
this.screenCity =city;
this.screenNumber=number;
}
}*/

//public void setScreenName(String name)
//{
	//this.name =name;
//}
//public String getScreenName()
//{
//return name;
//}
//public void setScreenCity(String city)
//{
	//this.city =city;
//}
//public String getScreenCity()
//{
	//return city;
	
//}
//public void setScreenNumber(int number)
//{
	//this.number =number;
//}
//public int getScreenNumber()
//{
	//return number;
//}

//}
