package com.redox.eims.data.service;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redox.eims.data.service.model.Library;
import com.redox.eims.data.service.model.LibraryServiceRequest;

public class MainClass {

	public static void main(String[] args) {
		LibraryServiceRequest request = getLibraruReqiest();
		String jsonString = getJson(request);
		System.out.println("Json : " + jsonString);

		try {
			// read from property file URL
			URL url = new URL("http://api.digifee.in/v1/library/create");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Authorization", "application/json");
			
			OutputStream os = conn.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			os.close();
			if (conn.getResponseCode() != 200) {
				System.out.println("Service Response OK " + conn.getResponseCode());
			} else {
				System.out.println("Service Response Fail: " + conn.getResponseCode());
			}
			conn.disconnect();

		} catch (Exception e) {

			System.out.println("Service Response Exception: " + e);
		}

	}

	private static String getJson(LibraryServiceRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		// Object to JSON in String
		String jsonInString = "";
		try {
			jsonInString = mapper.writeValueAsString(request);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonInString;
	}

	private static LibraryServiceRequest getLibraruReqiest() {
		LibraryServiceRequest request = new LibraryServiceRequest();
		List<Library> libraryList = new ArrayList<Library>();
		// get data from database and fill the value here
		// As of now there is mock value

		/*
		 * "SchoolRegistrationNumber": "123123", "employeeNumber": "12345",
		 * "accountNo": "999999", "issueDate": "20-01-2017", "dueDate":
		 * "20-01-2017", "returnDate": "20-01-2017", "issueRemark": "Test",
		 * "fine": "10"
		 */
		Library library = new Library();
		library.setSchoolRegistrationNumber("123123");
		library.setEmployeeNumber("12345");
		library.setAccountNo("999999");
		library.setIssueDate("20-01-2017");
		library.setDueDate("20-01-2017");
		library.setReturnDate("20-01-2017");
		library.setIssueRemark("Test");
		library.setFine("10");

		libraryList.add(library);

		// get all value and add into the list

		request.setLibrary(libraryList);
		return request;
	}

}
