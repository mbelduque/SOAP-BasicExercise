package com.mbelduque.ws;

import javax.jws.WebService;

//Indica donde se encuentra la interfaz que define los metodos que vamos a exponer
@WebService(endpointInterface = "com.mbelduque.ws.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int operation(int option, int val1, int val2) {
		int result = 0;
		switch (option) {
		case 1:
			result = val1 + val2;
			break;
		case 2:
			result = val1 - val2;
			break;
		case 3:
			result = val1 * val2;
			break;
		case 4:
			result = val1 / val2;
			break;

		default:
			break;
		}
		return result;
	}

}
