import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestmySetTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void mySet() throws Exception {
        DataStructureInt student1 = new DataStructure();
        Assert.assertTrue(student1.mySet().contains("Frank"));
    }
    @Test
    public void mySetSize()throws Exception{
        DataStructureInt student2 = new DataStructure();
        Assert.assertEquals(3,student2.mySet().size());

    }
    @Test
    public void testRemove()throws Exception{
        DataStructureInt student3 = new DataStructure();
        Assert.assertTrue(student3.mySet().remove("Liesl"));
    }

    @Test
    public void FailTest(){
        fail();
        System.out.println("This is my fail test");

    }
}