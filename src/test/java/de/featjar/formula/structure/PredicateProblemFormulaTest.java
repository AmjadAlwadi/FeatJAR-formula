/*
 * Copyright (C) 2025 FeatJAR-Development-Team
 *
 * This file is part of FeatJAR-formula.
 *
 * formula is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3.0 of the License,
 * or (at your option) any later version.
 *
 * formula is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with formula. If not, see <https://www.gnu.org/licenses/>.
 *
 * See <https://github.com/FeatureIDE/FeatJAR-formula> for further information.
 */
package de.featjar.formula.structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.featjar.base.data.Problem;
import de.featjar.formula.structure.predicate.ProblemFormula;
import org.junit.jupiter.api.Test;

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
        assertEquals(
                prf.cloneNode().getProblem().getSeverity(), prf.getProblem().getSeverity());
    }
}
