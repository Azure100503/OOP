package patterns.behavioral.itorator.profile;
import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String type;    //Type for what?
    private  String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email ) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {   //How does this method work? What is its purpose?
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);    //Why add null?
            }
        }
    }


    @Override
    public Profile getNext() {  //
        if (!hasNext()) {
            return null;
        }
        String friendEmail = emails.get(currentPosition);
        Profile  friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition,friendProfile);
        }
        currentPosition ++;
        return friendProfile;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();

    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
