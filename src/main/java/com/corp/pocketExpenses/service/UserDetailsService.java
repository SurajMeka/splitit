package com.corp.pocketExpenses.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.corp.pocketExpenses.model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserDetailsService {

	public String saveUserdata(User user) throws InterruptedException, ExecutionException {
		
		
		Firestore dbFireStore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture = dbFireStore.collection("UserData").document(user.getUserName()).set(user);
		
		
		return collectionsApiFuture.get().getUpdateTime().toString();
	}
}
