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
public class RailTest {
    
    

    /**
     * Test of szyfruj method, of class Rail.
     */
    @Test
    public void testSzyfruj() {
        Rail r = new Rail();
        assert("FCRNJAA".equals(r.szyfruj("FRANCJA", 3)));
        assert("DYEORDINBZ".equals(r.szyfruj("DOBRYDZIEN", 3)));
        assert("PTNOIEHIALCK".equals(r.szyfruj("POLITECHNIKA", 3)));
        assert("UETNVRIYIS".equals(r.szyfruj("UNIVERSITY", 3)));
        assert("CTARPORPYYGH".equals(r.szyfruj("CRYPTOGRAPHY", 3)));
    
    }
    
    @Test
    public void testOdszyfruj() {
        Rail r = new Rail();
        assert("FRANCJA".equals(r.odszyfruj("FCRNJAA", 3)));
        assert("DOBRYDZIEN".equals(r.odszyfruj("DYEORDINBZ", 3)));
        assert("POLITECHNIKA".equals(r.odszyfruj("PTNOIEHIALCK", 3)));
        assert("UNIVERSITY".equals(r.odszyfruj("UETNVRIYIS", 3)));
        assert("CRYPTOGRAPHY".equals(r.odszyfruj("CTARPORPYYGH", 3)));
    }

    
}
