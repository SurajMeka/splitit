package com.corp.pocketExpenses.service;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FireBaseInitialize {

	@PostConstruct
	public void initialize() {

		try {
			FileInputStream serviceAccount = new FileInputStream("./serviceAccount.json");


			FirebaseOptions options =  FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://pocketexpenses-e8c0a.firebaseio.com")
					.build();

			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
