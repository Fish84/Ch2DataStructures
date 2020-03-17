import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestmyMapTest {

    @Test
    public void myMap() {
        DataStructureInt student1 = new DataStructure();

        Assert.assertEquals("7",student1.myMap().get("Abduragmaan"));
    }
    @Test
    public void myMapSize() {
        DataStructureInt student2 = new DataStructure();

        Assert.assertEquals(4,student2.myMap().size());
    }

    @Test
    public void FailTest(){
        fail();
        System.out.println("This is my fail test");

    }
}