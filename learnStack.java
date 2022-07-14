

        import java.util.Stack ;

public class learnStack {
    public static void main(String[] args) {

        Stack<String> courses = new Stack<>();


        courses.push("c language");
        courses.push("c++language");
        courses.push("java language");
        courses.push("data structure language");
        System.out.println("stack:::"+ courses);
        System.out.println(courses.peek());
      courses.pop();


        System.out.println("stack:::"+ courses);
        System.out.println(courses.peek());

    }

}
