// tweet 
class Tweet implements Comparable<Tweet>{
    int time;
    int tweetId;
    Tweet(int t,int id){
        time = t;
        tweetId = id;

    }
    public int CompareTo(Tweet that){
        return that.time - this.time;
    }
}

public class Design_twitter {
    public Design_twitter() {
        
    }
    
    public void postTweet(int userId, int tweetId) {
        
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
