package com.java;

import java.util.Map;

import com.java.dto.BakeryDepartment;
import com.java.dto.DairyDepartment;

public class LexRequestFactory {
	public static LexRequest readFromMap(Map<String, Object> input) {
		LexRequest request = new LexRequest();
		try {
		Map<String, Object> bot = (Map<String, Object>) input.get("bot");
		String botName = (String) bot.get("name");
		request.setBotName(botName);
		Map<String, Object> intent = (Map<String, Object>) input.get("currentIntent");
		request.setIntentName(intent.get("name").toString());
		Map<String, Object> slots = (Map<String, Object>) intent.get("slots");
		switch (request.getIntentName()) {
		case BakeryDepartment.intentName:
			request.setProductName( (String) slots.get(BakeryDepartment.product));
			request.setQuantity( (int) slots.get(BakeryDepartment.quantity));
			request.setUnit(BakeryDepartment.defaultUnit);
			break;
		case DairyDepartment.intentName:
			request.setProductName( (String) slots.get(DairyDepartment.product));
			request.setQuantity( (int) slots.get(DairyDepartment.quantity));
			request.setUnit((String) slots.get(DairyDepartment.unit));
			break;
		default:
			sendFailureResponse(request,"Request department not recognized!");	
		}
		}catch(Exception e) {
			sendFailureResponse(request, e.getMessage());
		}
		return request;
	}

	private static void sendFailureResponse(LexRequest request, String message) {
		request.setError("Error reading request:"+ message);
	}
}
