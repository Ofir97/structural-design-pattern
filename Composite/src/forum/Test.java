package forum;

import forum.Forum;

public class Test {
    public static void main(String[] args) {
        Forum f1 = new Forum(); // represents the main folder

        f1.add(new Person("Yakov")); // file
        f1.add(new Person("Dan")); // file
        f1.add(new Person("Ynon")); // file
        f1.add(new Person("Noy")); // file
        f1.add(new Person("Shaul")); // file
        f1.add(new Person("Mike")); // file

        Forum f2 = new Forum(); // sub-folder
        f2.add(new Person("Daniel")); // file
        f2.add(new Person("Shir")); // file

        f1.add(f2); // insert sub-folder f2 into main-folder f1

        f1.info();
    }
}
