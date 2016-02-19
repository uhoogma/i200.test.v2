import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HelloJava {

    public static String sayHello() {
        // return "";
        return "Hello Java";
    }
/*
    public static void genericsReplaceTest() {
        List<String> al = new ArrayList<>();
        System.out.println(al);
        // List<Div> html = new ArrayList<>(); // still crashes Wicket
        // Collection<?> b = new ArrayList<>(); // wildcard replacement not supported
    }

    public void methodWithComplicatedSignature(List<? extends String> shapes) {

    }

    public static List<Integer> sortIntegers(List<Integer> myList) {
        Collections.sort(myList, (n1, n2) -> n1 > n2 ? 1 : (n1 < n2 ? -1 : 0));
        // return new ArrayList<Integer>();
        return myList;
    }

    public static Integer sumList(List<Integer> myList) {
        Integer sum = myList.stream().filter(elem -> (elem > 0))
                .reduce(0, (s, e) -> s + e);
        System.out.println("SumPos is: " + sum);
        // return -1;
        return sum;
    }

    public static Integer sumListConditionally(List<Integer> myList) {
        Integer conditional = myList.stream().map(e -> e * 2)
                .filter(e -> (e > 3)).findFirst().orElse(null);
        System.out.println("conditional is: " + conditional);
        // return -1;
        return conditional;
    }

    public static Double defineFunctionalInterface(Double param) {
        Talker<Double> dtalk = i -> returnValue(i);
        return dtalk.talk(param);
        // return -1.0;
    }

    public static String reverseCase(String param) {
        StringBuilder sb = new StringBuilder();
        param.chars().map(HelloJava::myMap).forEach(ch -> sb.append((char) ch));
        // return "";
        return sb.toString();
    }

    public static Double functionComposition(Double param) {
        Function<Double, Double> g = ((Function<Double, Double>) Math::sin)
                .compose(Math::toRadians);
        // return -1.0;
        return (g.apply(param));
    }

    public static Integer functionCombination() {
        BiFunction<Integer, Integer, Integer> p = HelloJava::minus;
        Function<Integer, Integer> p1 = proj1(p, 2);
        p1.apply(8);
        Function<Integer, Integer> p2 = proj2(p, 1);
        p2.apply(9);
        // return -2;
        return (functionCombination(p1, p2).apply(4));
    }

    // Helper functions
    public static Double returnValue(Double i) {
        return i;
    }

    public static <T, U> Function<T, U> functionCombination(Function<U, U> f,
            Function<T, U> g) {
        return x -> f.apply(g.apply(x));
    }

    public static int minus(int a1, int a2) {
        System.out.println("(" + a1 + "-" + a2 + ") ");
        return a1 - a2;
    }

    public static <T, U, V> BiFunction<T, U, V> sBiCombine(
            BiFunction<T, U, V> f, BiFunction<T, U, U> g) {
        return (x, y) -> f.apply(x, g.apply(x, y));
    }

    public static <T, U> Function<U, U> proj1(BiFunction<T, U, U> b, T arg) {
        System.out.println("(" + b + " in proj1 applied to " + arg);
        return y -> b.apply(arg, y);
    }

    public static <T, U> Function<T, T> proj2(BiFunction<T, U, T> b, U arg) {
        System.out.println("(" + b + " in proj2 applied to " + arg);
        return x -> b.apply(x, arg);
    }

    // user defined map
    public static int myMap(int chi) {
        char ch = (char) chi;
        if (Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch);
        } else if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else {
            return ch;
        }
    }

    // User defined functional interface
    @FunctionalInterface
    interface Talker<X> {

        Double talk(X x);
    }

    // User defined functional interface
    @FunctionalInterface
    interface Talker2<X> {

        void talk(X x);
    }

    // talk must be overriden, log can be overriden, newlog can be used
    @FunctionalInterface
    interface Talker3<X> {

        void talk(X x); // compulsory method

        default void log(X x) { // possible to override
            System.out.println("logged by log in Talker interface: " + x);
            newlog(x.toString());
        }

        static void newlog(String s) { // impossible to override, possible to
            // use
            System.out.println("logged by newlog in Talker interface: " + s);
        }
    }

    static class Div {

    }

    static class MyTalker1<X> implements Talker3<X> {

        @Override
        public void talk(X x) {
            System.out.println("talk from MyTalker3: " + x);
        }

        @Override
        public void log(X x) {
            System.out.println("logged by log in Mytalker1: " + x);
            System.out.println("also call to newlog by log in MyTalker1:");
            Talker3.newlog(x.toString()); // it is possible to use interface
            // static method in class
        }
    }*/
}

