package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private  static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("57ef0575-1b4b-476e-83a6-f92fe5e8ce44"), "janetjones", null ));
        USER_PROFILES.add(new UserProfile(UUID.fromString("ac18e5ae-a49f-4d4c-be06-0d47a6f68d72"), "antoniojunior", null ));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
