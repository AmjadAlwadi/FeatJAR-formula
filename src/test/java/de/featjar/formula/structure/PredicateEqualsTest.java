package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.Equals;
import de.featjar.formula.structure.predicate.False;
import de.featjar.formula.structure.predicate.True;
import de.featjar.formula.structure.term.value.*;


public class PredicateEqualsTest {

	@Test
    void _getName() {
		
		Constant c1 = new Constant(1);
		
		Equals eq = new Equals(c1,c1);
        assertEquals("=", eq.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Constant c1 = new Constant(1);
		
		Equals eq = new Equals(c1,c1);
		
        assertEquals(eq, Trees.clone(eq));
        assertEquals(Trees.clone(eq).evaluate(), eq.evaluate());
        assertTrue(eq.cloneNode() instanceof Equals);
        
    }
	
	
}
