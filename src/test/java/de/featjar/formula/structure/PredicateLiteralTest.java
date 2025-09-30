package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.featjar.base.tree.Trees;
import de.featjar.formula.structure.predicate.Literal;
import de.featjar.formula.structure.term.value.Constant;

public class PredicateLiteralTest {
	
	
	@Test
    void _getName() {
		
		Literal l = new Literal("x");
		l.setPositive(true);
        assertEquals("+", l.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Literal l = new Literal("x");
		l.setPositive(true);
		assertEquals(l.getChildren().get(0), Trees.clone(l).getChildren().get(0));
        assertEquals(l.cloneNode().isPositive(), l.isPositive());
    }

}
