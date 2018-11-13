package de.uni_potsdam.hpi.asg.breeze2stg.stg;

import de.uni_potsdam.hpi.asg.common.breeze.model.HSComponentType;

/*
 * Copyright (C) 2018 Norman Kluge
 * 
 * This file is part of ASGbreeze2stg.
 * 
 * ASGbreeze2stg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ASGbreeze2stg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ASGbreeze2stg.  If not, see <http://www.gnu.org/licenses/>.
 */

import de.uni_potsdam.hpi.asg.common.stg.model.STG;

public abstract class STGGenerator {
    protected String componentName;
    protected STG    stg;

    protected STGGenerator(String componentName, STG stg) {
        this.componentName = componentName;
        this.stg = stg;

    }

    public abstract STG generate(int scale, HSComponentType type);
}