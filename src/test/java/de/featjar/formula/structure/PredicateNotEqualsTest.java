package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.False;
import de.featjar.formula.structure.predicate.NotEquals;
import de.featjar.formula.structure.term.value.Constant;

public class PredicateNotEqualsTest {
	
	@Test
    void _getName() {
		
		Constant c1 = new Constant(1);
		Constant c2 = new Constant(2);
		
		NotEquals eq = new NotEquals(c1,c2);
        assertEquals("!=", eq.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Constant c1 = new Constant(1);
		Constant c2 = new Constant(2);
		
		NotEquals neq1 = new NotEquals(c2,c1);
		NotEquals neq2 = new NotEquals(c1,c2);
		
		assertEquals(neq1.evaluate(), neq2.evaluate());
		assertEquals(Trees.clone(neq1).evaluate(), neq1.evaluate());
		assertEquals(neq1.getType(), java.lang.Boolean.class);
        
    }

}
