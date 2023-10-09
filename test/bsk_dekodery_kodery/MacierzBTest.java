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
public class MacierzBTest {

    /**
     * Test of szyfruj method, of class MacierzB.
     */
    
    @Test
    public void testSzyfruj()
    {
        MacierzB B = new MacierzB();
     
  
        // TODO review the generated test code and remove the default call to fail.

        assert("ACFJRAN".equals(B.szyfruj("FRANCJA", "BCADA")));
        assert("BIYNDDOZRE".equals(B.szyfruj("DOBRYDZIEN", "BCADA")));
        assert("LHTIPEKOCAIN".equals(B.szyfruj("POLITECHNIKA", "BCADA")));
        assert("IIEYURNSVT".equals(B.szyfruj("UNIVERSITY", "BCADA")));
    }
    @Test
    public void testOdszyfruj() {
    MacierzB B = new MacierzB();
      
        assert("FRANCJA".equals(B.odszyfruj("ACFJRAN", "BCADA")));
        assert("DOBRYDZIEN".equals(B.odszyfruj("BIYNDDOZRE", "BCADA")));
        assert("POLITECHNIKA".equals(B.odszyfruj("LHTIPEKOCAIN", "BCADA")));
        assert("UNIVERSITY".equals(B.odszyfruj("IIEYURNSVT", "BCADA")));
    }
    
}
