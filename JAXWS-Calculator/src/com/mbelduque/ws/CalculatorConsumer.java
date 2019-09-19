package com.mbelduque.ws;

// Esta clase se usa para probar el consumo del web service 
public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorImplService calculatorService = new CalculatorImplService();
		Calculator consumer = calculatorService.getCalculatorImplPort();
		System.out.println("Suma");
		System.out.println(consumer.operation(1, 5, 7));
		
		System.out.println("Resta");
		System.out.println(consumer.operation(2, 22, 14));
		
		System.out.println("Multiplicación");
		System.out.println(consumer.operation(3, 5, 3));
		
		System.out.println("División");
		System.out.println(consumer.operation(4, 20, 5));
	}

}
