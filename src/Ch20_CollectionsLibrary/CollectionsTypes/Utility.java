package Ch20_CollectionsLibrary.CollectionsTypes;
import java.util.Collection;

public class Utility {

    public static <E> void print(Collection<E> collection){

        if (collection.size() == 0){
            System.out.println("Collection is Empty");
        }else {
            System.out.print("Collection is : ");
            for (E obj : collection ){
                System.out.printf("%s ", obj);
            }
        }
        System.out.println();
    }

}
