// tweet 

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Tweet implements Comparable<Tweet>{
    int time;
    int tweetId;
    Tweet(int t,int id){
        time = t;
        tweetId = id;

    }
    public int compareTo(Tweet that){
        return that.time - this.time;
    }
}
//User

public class User{
    int userId;
    HashSet<Integer> followers;
    List<Tweet> tweets;

    User(int userId){
        this.userId = userId;
        followers = new HashSet<>();
        tweets = new LinkedList<>();
    }

    public void addTweet(Tweet t){
        tweets.add(0,t);
    }
}

public class Design_twitter {
    HashMap<Integer,User> userMap;
    int TimeCounter;
    public Design_twitter() {
        userMap = new HashMap<>();
        TimeCounter =0;
    }
    
    public void postTweet(int userId, int tweetId) {
        TimeCounter++;

        if(!userMap.containsKey(userId)){
            userMap.put((userId), new User(userId));
        }

        User user = userMap.get(userId);
        user.addTweet(new Tweet(TimeCounter, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
    }
    
    public void follow(int followerId, int followeeId) {
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        
    }

    public static void main(String[] args) {
        
    }
}
