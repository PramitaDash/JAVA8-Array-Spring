package collection;

import java.util.*;

public class ListExampleUsingAllMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Cherry");
        list.add("Apple");
        list.add(1,"Orange");

        System.out.println(list);

        System.out.println("iteration using for each loop");
        for (String fruit:list){
            System.out.println(fruit);
        }

        System.out.println("Iteration using for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("using iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("using listinterator forword");
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("using Listiterator backword");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());

        }
        System.out.println("using stream");
        list.stream().forEach(System.out::println);
        System.out.println(list.get(1));
        list.set(3,"kaju");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.remove("Apple"));
        System.out.println(list);
        System.out.println(list.contains("Cherry"));
        System.out.println(list.indexOf("Cherry"));
        list.add("Grapes");
        System.out.println(list);
        System.out.println(list.lastIndexOf("Grapes"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        List<String> sublist = list.subList(1,3);
        System.out.println(sublist);
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.clear();
        System.out.println(list);
    }

}
