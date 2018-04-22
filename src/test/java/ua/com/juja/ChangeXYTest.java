package ua.com.juja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dmitriy on 4/22/2018.
 */
public class ChangeXYTest {
    @Test
    public void test1_codex_codey(){
        assertExpection("codex", "codey");
        assertExpection("codex2", "codey2");
        assertExpection("codex!", "codey!");
        assertExpection("codex!", "codey!");
        assertExpection("codex!", "codey!");
        assertExpection("codex!", "codey!");
    }

    @Test
    public void test2_xxhixx_yyhiyy(){
        assertExpection("xxhixx", "yyhiyy");
    }
    @Test
    public void test3_xhixhix_yhiyhiy(){
        assertExpection("xhixhix", "yhiyhiy");
    }
    @Test
    public void test4_x_y(){
        assertExpection("x", "y");
    }
    @Test
    public void test5_hihi_hihi()
    {
        assertExpection("hihi", "hihi");
        assertExpection("haha", "haha");
    }


    public static void assertExpection(String input, String expected) {
        String actual = ChangeXY.changeXY(input);
        assertEquals(expected, actual);
    }


}
