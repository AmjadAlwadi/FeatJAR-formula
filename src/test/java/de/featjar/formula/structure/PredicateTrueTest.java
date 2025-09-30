package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.featjar.formula.structure.predicate.True;

public class PredicateTrueTest {
	
	@Test
    void _getName() {
        assertEquals("true", True.INSTANCE.getName());
    }
	
	
	@Test
    void _cloneNode() {
		True f1 = True.INSTANCE;
		True f2 = True.INSTANCE;
		assertEquals(f1.cloneNode(), f2.cloneNode());
        assertEquals(True.INSTANCE, f1.cloneNode());
        assertEquals(True.INSTANCE, f2.cloneNode());
    }

}
