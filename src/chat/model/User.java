package chat.model;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private boolean status; //True -> logged in , False -> otherwise

    private List<User> friends;
    private List<Message> received;
    private List<Message> pending;

    private Server server;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnline() { //returns True is user is online
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<Message> getReceived() {
        return received;
    }

    public void setReceived(List<Message> received) {
        this.received = received;
    }

    public List<Message> getPending() {
        return pending;
    }

    public void setPending(List<Message> pending) {
        this.pending = pending;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.status = false;
        this.friends = new ArrayList<>();
        this.received = new ArrayList<>();
        this.pending = new ArrayList<>();
    }

    public void sendMessage(String text, String username)
    {
        boolean found = false;
        //first check if the users are friends
        User friend = null;
        for(User u: this.getFriends())
        {
            if (u.username.equals(username)) {
                found = true;
                friend = u;
                break;
            }
        }
        if(found)
        {
            Message message = new Message(this,friend,text);
            server.sendMessage(message);
        }
        else
        {
            System.out.println("YOUR ARE NOT FRIENDS!");
        }
    }
}
