// tweet 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

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

class User{
    int userId;
    HashSet<Integer> followees; // changed from followers to followees
    List<Tweet> tweets;

    User(int userId){
        this.userId = userId;
        followees = new HashSet<>();
        tweets = new LinkedList<>();
        followees.add(userId); // user follows themselves by default
    }

    public void addTweet(Tweet t){
        tweets.add(0,t);
    }
    public void follow(int followeeId){
        followees.add(followeeId);
    }
    public void unfollow(int followeeId){
        if(followeeId != this.userId) // cannot unfollow self
            followees.remove(followeeId);
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
        if(!userMap.containsKey(userId)){
            return new ArrayList<>();
        }  

        PriorityQueue<Tweet> pq = new PriorityQueue<>();
        User user = userMap.get(userId);

        for(int followeeId: user.followees){
            if(!userMap.containsKey(followeeId)) continue;
            int count=0;
            for(Tweet tweet: userMap.get(followeeId).tweets){
                pq.offer(tweet);
                count++;
                if(count>=10){
                    break;
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        int index=0;
        while(!pq.isEmpty() && index<10){
            Tweet tweet = pq.poll();
            res.add(tweet.tweetId);
            index++;
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            userMap.put(followerId, new User(followerId));
        }
        if(!userMap.containsKey(followeeId)){
            userMap.put(followeeId, new User(followeeId));
        }
        userMap.get(followerId).follow(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId) || !userMap.containsKey(followeeId)) return;
        userMap.get(followerId).unfollow(followeeId);
    }

    public static void main(String[] args) {
        Design_twitter twitter = new Design_twitter();

        // User 1 posts a tweet (id = 5)
        twitter.postTweet(1, 5);

        // User 1's news feed should return a list with tweet id -> [5]
        System.out.println(twitter.getNewsFeed(1));

        // User 1 follows user 2
        twitter.follow(1, 2);

        // User 2 posts a tweet (id = 6)
        twitter.postTweet(2, 6);

        // User 1's news feed should return [6, 5]
        System.out.println(twitter.getNewsFeed(1));

        // User 1 unfollows user 2
        twitter.unfollow(1, 2);

        // User 1's news feed should return [5]
        System.out.println(twitter.getNewsFeed(1));
    }
}
