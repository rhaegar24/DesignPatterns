package org.lld;

public class User2 {

    private String userName;
    private String userId;
    private String userEmail;

    public User2(User2Builder user2Builder) {
        this.userName = user2Builder.userName;
        this.userId = user2Builder.userId;
        this.userEmail = user2Builder.userEmail;
    }

    public static User2Builder builder(){
        return new User2.User2Builder();
    }

    public static class User2Builder{

        private String userName;
        private String userId;
        private String userEmail;

        public User2Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User2Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public User2Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public User2 build(){
            return new User2(this);
        }
    }
}
