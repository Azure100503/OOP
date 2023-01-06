package patterns.behavioral.itorator.profile;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    // request profile prom facebook. For instance, when you log in fb you have to wait for loading
    public Profile requestProfileFromFacebook(String profileEmail) {
        simulateNetWorkLatency();
        System.out.println("Facebook: Loading profile " + profileEmail + " over the network... ");
        return findProfile(profileEmail);

    }


    //Mô phỏng độ chậm của mạng
    private void simulateNetWorkLatency() {
        try {
            Thread.sleep(2500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    public List<String> requestProfileFromFacebook(String profileEmail, String contactType) {
        simulateNetWorkLatency();
        System.out.println("Facebook: Loading " + contactType + " list of " + profileEmail + "over the network...");
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }


    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, "friends", profileId);

    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, "coworkers", profileId);

    }
}
