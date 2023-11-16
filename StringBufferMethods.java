public class StringBufferMethods {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original string: " + sb);

        sb.append(" How are you?");
        System.out.println("After append: " + sb);

        sb.insert(7, "Java ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        sb.delete(0, 3);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        int length = sb.length();
        System.out.println("Length of string: " + length);

        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);
    }
}
