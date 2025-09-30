package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.LessEqual;
import de.featjar.formula.structure.term.value.Constant;

public class PredicateLessEqualTest {
	
	
	@Test
    void _getName() {
		
		Constant c1 = new Constant(1);
		
		LessEqual neq = new LessEqual(c1,c1);
        assertEquals("<=", neq.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Constant c1 = new Constant(1);
		
		LessEqual neq = new LessEqual(c1,c1);
		
        assertEquals(neq, Trees.clone(neq));
        assertEquals(Trees.clone(neq).evaluate(), neq.evaluate());
        assertTrue(neq.cloneNode() instanceof LessEqual);
        
    }
	

}
