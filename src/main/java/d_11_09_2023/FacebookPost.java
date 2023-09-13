package d_11_09_2023;

public class FacebookPost {
    private String text;
    private User user;

    FacebookPost(String text, User user){
        this.text = text;
        this.user = user;
    }
    public void print(){
        System.out.println("User is: " + this.user.getName() + " " + this.user.getSurname());
        System.out.println("Post text is: " + this.text);
    }
}
