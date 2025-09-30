package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.featjar.formula.structure.predicate.ProblemFormula;
import de.featjar.base.data.Problem;

public class PredicateProblemFormulaTest {
	
	
	@Test
    void _getName() {
		Problem pr = new Problem("Error");
		ProblemFormula prf = new ProblemFormula(pr);
        assertEquals(pr.toString(), prf.getName());
    }
	
	
	@Test
    void _cloneNode() {
		
		Problem pr = new Problem("Error");
		ProblemFormula prf = new ProblemFormula(pr);
		
		assertEquals(prf.cloneNode().getProblem().getMessage(), prf.getProblem().getMessage());
		assertEquals(prf.cloneNode().getProblem().getSeverity(), prf.getProblem().getSeverity());

    }

}
