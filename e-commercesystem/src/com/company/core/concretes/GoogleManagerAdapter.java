package com.company.core.concretes;

import com.company.GoogleAuth.GoogleManager;
import com.company.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {
    @Override
    public void registerWithGoogleAccount(String message) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.registerWithGoogle(message);
    }
}
