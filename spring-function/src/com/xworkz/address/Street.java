package com.xworkz.address;

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
public class Street {
@Value("sheelu")
private String name;
@Value("23")
private int streetNumber;
}
