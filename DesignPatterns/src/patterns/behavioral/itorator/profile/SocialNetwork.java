package patterns.behavioral.itorator.profile;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileId);
    public ProfileIterator createCoworkersIterator(String profileId);

}
