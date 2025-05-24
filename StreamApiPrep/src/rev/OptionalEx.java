package rev;

import java.util.Arrays;
import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<String> name = getName(1);
//        if(name.isPresent()){
//            System.out.println(name.get());
//        }
//        name.ifPresent(x-> System.out.println(x));

//        String nameTouse = name.get();
//        String nameTouse = name.isPresent()?name.get():"NA";
//        String nameTouse = name.orElse("NA");
//        System.out.println(nameTouse);

        Optional<Integer> count = name.map(x->x.length());
        count.ifPresent(System.out::println);

    }

    private static Optional<String> getName(int id){
//        String name = "Priya";
        String name = null;
//        return Optional.ofNullable(name);
        return Optional.of("Prachi");
    }
}
