package org.lld;

public class User {

    /**
       will use this class to learn about builder design pattern
       builder design pattern solves the problem where multiple fields have to passed into
       a constructor, and we need to check the order of the fields and maybe there is no
       initialization of a field within a constructor then we will have to overload the constructor
       Using builder is same as using @Builder in spring, this allows use to easily build a new
       DTO by explicitly setting the fields using setters
    */

    private String userName;
    private String userId;
    private String userEmail;

    private User(UserBuilder userBuilder){
        this.userName = userBuilder.userName;
        this.userId = userBuilder.userId;
        this.userEmail = userBuilder.userEmail;
    }

    public static UserBuilder builder(){
        return new User.UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", userId='" + userId + '\'' + ", userEmail='" + userEmail + '\'' + '}';
    }

    /**
       Now if we want to set the fields userId, userName and userEmail we will have to call the constructor
       what if I want to set only one field at a time? in this case i will need to have 5 constructors, this
       problem will be solved by Builder design pattern
    */

    public static class UserBuilder{

        private String userName;
        private String userId;
        private String userEmail;

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
