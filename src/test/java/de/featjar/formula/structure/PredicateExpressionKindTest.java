package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.featjar.formula.structure.predicate.ExpressionKind;

public class PredicateExpressionKindTest {
	
	@Test
    void _getName() {
        assertEquals("Boolean", ExpressionKind.BOOLEAN.getName());
        assertEquals("arbitrary", ExpressionKind.ARBITRARY.getName());
    }
	
}
