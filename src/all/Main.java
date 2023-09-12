package all;

public class Main {

    public static class User {
        private String name;
        private int code;

        public User(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public void modifyUser () {
            this.setName("Vu Thuc");
            this.setCode(20);
        }
    }
    public static void modifyLong(Long value) {
        value = 42L; // Thay đổi giá trị của đối tượng Long
    }

    public static void modifyUser2(User user) {
        user.setName("Thuc Vu");
        user.setCode(30);
    }

    public static void modifyString (String value) {
        value = "Hello";
    }

    public static void main(String[] args) {
        Long myLong = 10L;
        System.out.println("Before: " + myLong);
        modifyLong(myLong);
        System.out.println("After: " + myLong); // Kết quả vẫn là 10

        System.out.println();
        String s = new String("xin chao");
        System.out.println();
        System.out.println(s);
        modifyString(s);
        System.out.println(s);
        User user = new User("Thuc", 18);
        System.out.println(user.getName() + " " + user.getCode());
        user.modifyUser();
        System.out.println(user.getName() + " " + user.getCode());
        modifyUser2(user);
        System.out.println(user.getName() + " " + user.getCode());
    }
}