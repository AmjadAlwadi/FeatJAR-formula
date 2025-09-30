package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.LessThan;
import de.featjar.formula.structure.term.value.Constant;

public class PredicateLessThanTest {
	
	@Test
    void _getName() {
		
		Constant c1 = new Constant(1);
		Constant c2 = new Constant(2);
		
		LessThan eq = new LessThan(c1,c2);
        assertEquals("<", eq.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Constant c1 = new Constant(1);
		Constant c2 = new Constant(2);
		
		LessThan eq = new LessThan(c1,c2);
		
        assertEquals(eq, Trees.clone(eq));
        assertEquals(Trees.clone(eq).evaluate(), eq.evaluate());
        assertTrue(eq.cloneNode() instanceof LessThan);
        
    }

}
