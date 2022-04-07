package com.example.tesseract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesseractApplication {
	
	public static void main(String[] args) {
		
		ConversionImpl conversionImpl = new ConversionImpl();
		conversionImpl.extractText();
		SpringApplication.run(TesseractApplication.class, args);
	}

}
