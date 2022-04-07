package com.example.tesseract;

import java.io.File;

import org.springframework.stereotype.Component;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

@Component
public class ConversionImpl {

	public void extractText() {

		try {

			ITesseract tesseract = new Tesseract();
			tesseract.setDatapath("C:/Users/sudhindra.desigan/Documents/workspace/tesseract/tessdata");
			String text = tesseract.doOCR(new File("C:/users/sudhindra.desigan/HireRightDoc/download.jpg"));
			System.out.println(text);

		} catch (Exception e) {

		}
	}
}
