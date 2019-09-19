package com.mbelduque.ws;

import javax.xml.ws.Endpoint;

// Al ejecutar esta clase generará el archivo WSDL(contrato) que expone los servicios del web service
public class CalculatorPublish {

	public static void main(String[] args) {
		// Levanta un servidor "virtual"
		Endpoint.publish("http://localhost:1515/WS/Calculator", new CalculatorImpl());
	}

}

// con el comando en cmd (wsimport -s . http://localhost:1515/WS/Calculator) se crearan las clases que van a permitir consumir el web service