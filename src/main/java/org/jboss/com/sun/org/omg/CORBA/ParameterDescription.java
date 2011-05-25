/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.jboss.com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/ParameterDescription.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:50 AM PDT
*/

// This file has been _CHANGED_

public final class ParameterDescription implements org.omg.CORBA.portable.IDLEntity
{
    public String name = null;
    public org.omg.CORBA.TypeCode type = null;
    // _CHANGED_
    //public org.jboss.com.sun.org.omg.CORBA.IDLType type_def = null;
    public org.omg.CORBA.IDLType type_def = null;
    public org.jboss.com.sun.org.omg.CORBA.ParameterMode mode = null;

    public ParameterDescription ()
    {
    } // ctor

    // _CHANGED_
    //public ParameterDescription (String _name, org.omg.CORBA.TypeCode _type, org.jboss.com.sun.org.omg.CORBA.IDLType _type_def, org.jboss.com.sun.org.omg.CORBA.ParameterMode _mode)
    public ParameterDescription (String _name, org.omg.CORBA.TypeCode _type, org.omg.CORBA.IDLType _type_def, org.jboss.com.sun.org.omg.CORBA.ParameterMode _mode)
    {
        name = _name;
        type = _type;
        type_def = _type_def;
        mode = _mode;
    } // ctor

} // class ParameterDescription