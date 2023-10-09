/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bsk_dekodery_kodery;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poker
 */
public class MacierzATest {
    

    /**
     * Test of szyfruj method, of class MacierzA.
     */
    @Test
    public void testSzyfruj() {
    
        MacierzA A = new MacierzA();
        // TODO review the generated test code and remove the default call to fail.
        assert("YCPRGTROHAYPAOS".equals(A.szyfruj("CRYPTOGRAPHYOSA", "3-1-4-2")));
        assert("ANFCRJA".equals(A.szyfruj("FRANCJA", "3-4-1-5-2")));
        assert("BRDYOIEDNZ".equals(A.szyfruj("DOBRYDZIEN", "3-4-1-5-2")));
        assert("LIPTOHNEICKA".equals(A.szyfruj("POLITECHNIKA", "3-4-1-5-2")));
        assert("IVUENITRYS".equals(A.szyfruj("UNIVERSITY", "3-4-1-5-2")));
    }

    /**
     * Test of odszyfruj method, of class MacierzA.
     */
    @Test
    public void testOdszyfruj() {

        MacierzA A = new MacierzA();
        assert("FRANCJA".equals(A.odszyfruj("ANFCRJA", "3-4-1-5-2")));
        assert("CRYPTOGRAPHYOSA".equals(A.odszyfruj("YCPRGTROHAYPAOS", "3-1-4-2")));
        assert("DOBRYDZIEN".equals(A.odszyfruj("BRDYOIEDNZ", "3-4-1-5-2")));
        assert("POLITECHNIKA".equals(A.odszyfruj("LIPTOHNEICKA", "3-4-1-5-2")));
        assert("UNIVERSITY".equals(A.odszyfruj("IVUENITRYS", "3-4-1-5-2")));
    }
    
}
