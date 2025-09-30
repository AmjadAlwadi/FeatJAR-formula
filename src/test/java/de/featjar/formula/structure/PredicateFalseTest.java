package de.featjar.formula.structure;

import de.featjar.formula.structure.predicate.False;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import de.featjar.formula.structure.predicate.False;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import de.featjar.formula.structure.predicate.False;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PredicateFalseTest {
	
	@Test
    void _getName() {
        assertEquals("false", False.INSTANCE.getName());
    }
	
	
	@Test
    void _cloneNode() {
		False f1 = False.INSTANCE;
		False f2 = False.INSTANCE;
		assertEquals(f1.cloneNode(), f2.cloneNode());
        assertEquals(False.INSTANCE, f1.cloneNode());
        assertEquals(False.INSTANCE, f2.cloneNode());
    }
	
	
}
