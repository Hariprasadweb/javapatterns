public class Test {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent());

        ThreadGroup group1=new ThreadGroup("First group");
        System.out.println(group1.getName());
        ThreadGroup group2=new ThreadGroup(group1,"Second group");
        System.out.println(group2.getParent().getName());
    }
}
