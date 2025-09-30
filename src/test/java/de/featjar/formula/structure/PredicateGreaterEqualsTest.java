package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.GreaterEqual;
import de.featjar.formula.structure.term.value.Constant;

public class PredicateGreaterEqualsTest {
	
	
	@Test
    void _getName() {
		
		Constant c1 = new Constant(1);
		Constant c2 = new Constant(2);
		
		GreaterEqual eq = new GreaterEqual(c1,c2);
        assertEquals(">=", eq.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Constant c1 = new Constant(1);
		
		GreaterEqual eq = new GreaterEqual(c1,c1);
		
        assertEquals(eq, Trees.clone(eq));
        assertEquals(Trees.clone(eq).evaluate(), eq.evaluate());
        assertTrue(eq.cloneNode() instanceof GreaterEqual);
        
    }

}
