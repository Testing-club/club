package lesson9;

import java.util.ArrayList;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String lastmane;
    private String email;

    private String facebookId;
    private String telegramId;
    private String instagramId;


    public User(String name, String lastmane, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.lastmane = lastmane;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastmane() {
        return lastmane;
    }

    public void setLastmane(String lastmane) {
        this.lastmane = lastmane;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }


    public ArrayList<MessageSender>  getSocialMediaList() {
        ArrayList<MessageSender> socialMediaList = new ArrayList<>();

        if(this.facebookId !=null) socialMediaList.add(new FacebookClient(facebookId));
        if(this.telegramId !=null) socialMediaList.add(new TelegramClient(telegramId));
        if(this.instagramId !=null) socialMediaList.add(new InstagramClient(instagramId));
        return socialMediaList;
    }
}
