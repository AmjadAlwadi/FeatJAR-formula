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

import de.featjar.formula.structure.predicate.True;
import org.junit.jupiter.api.Test;

public class PredicateTrueTest {

    @Test
    void _getName() {
        assertEquals("true", True.INSTANCE.getName());
    }

    @Test
    void _cloneNode() {
        True f1 = True.INSTANCE;
        True f2 = True.INSTANCE;
        assertEquals(f1.cloneNode(), f2.cloneNode());
        assertEquals(True.INSTANCE, f1.cloneNode());
        assertEquals(True.INSTANCE, f2.cloneNode());
    }
}
