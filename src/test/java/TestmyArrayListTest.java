import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestmyArrayListTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void myArrayList() throws Exception {
        DataStructureInt students1 = new DataStructure();
        Assert.assertTrue(students1.myArrayList().contains("Abduragmaan"));
    }

    @Test
    public void TestMyListSize()throws Exception{
        DataStructureInt st2 = new DataStructure();
         Assert.assertEquals(4,st2.myArrayList().size());
    }
    @Test
    public void FailTest(){
        fail();
        System.out.println("This is my fail test");

    }
}