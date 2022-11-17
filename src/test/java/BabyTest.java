import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BabyTest {

    @org.junit.jupiter.api.Test
    void lifeEventCreate() {
    }

    @Test
    void diaper(){
        assertEquals(0, Baby.diaper());
    }

}