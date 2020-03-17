import java.util.*;

public class DataStructure implements DataStructureInt {

    public DataStructure() {
    }
    @Override
    public List myArrayList(){
        List a1 = new ArrayList();

        a1.add("Abduragmaan");
        a1.add("Frank");
        a1.add("Liesl");
        a1.add("Heinrich");
        System.out.println("Array list elements");
        System.out.println("\t"+ a1);

        return a1;
    }
    @Override
    public Set mySet(){

        Set s1 = new HashSet();
        s1.add("Abduragmaan");
        s1.add("Frank");
        s1.add("Liesl");
        s1.add("Riyaad");
        System.out.println("This is my Set contents");
        System.out.println("\t"+s1);

        s1.remove("Abduragmaan");
        System.out.println("This is my Set contents after REMOVE");
        System.out.println("\t"+s1);
        return s1;

    }
    @Override
    public Map<String,String> myMap(){
        Map m1 = new HashMap();
        m1.put("Abduragmaan","7");
        m1.put("Frank","5");
        m1.put("Liesl","10");
        m1.put("Craig","9");

        System.out.println("Contents of my MAP");
        System.out.println("\t"+m1);
        return m1;

    }
}
