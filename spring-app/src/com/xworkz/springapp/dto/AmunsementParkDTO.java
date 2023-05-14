package com.xworkz.springapp.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AmunsementParkDTO implements Serializable {

private int parkId;
private String parkName;
private String address;
private String cityName;
private double entryFee;
private String area;




}
