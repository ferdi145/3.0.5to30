/*
 * Copyright (c) 2011 - 2019, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.migrationmodul;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.migrationmodul.*;
/**
* Generated class for your ClassB data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "MigrationModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.migrationmodul.ClassBHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.migrationmodul.ClassBHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class ClassB extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.migrationmodul.ClassB> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.migrationmodul.ClassB>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "MigrationModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "ClassB";

    /** class specific attributes */
    private java.util.List<com.apiomat.nativemodule.migrationmodul.ClassA> classAs = new java.util.ArrayList<com.apiomat.nativemodule.migrationmodul.ClassA>();
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public ClassB ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public java.util.List<com.apiomat.nativemodule.migrationmodul.ClassA> getClassAs() 
    {
        if(this.classAs == null || this.classAs.size() == 0)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReferences", String.class,  Class.class );
                this.classAs =  ( java.util.List<com.apiomat.nativemodule.migrationmodul.ClassA> ) m.invoke( this, "classAs", com.apiomat.nativemodule.migrationmodul.ClassA.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                //silently ignored
            }
        }   
        return this.classAs;
    }

    public void postClassAs( final com.apiomat.nativemodule.migrationmodul.ClassA refData )
    {
        addReference( "classAs", refData );
        this.classAs.add( refData );
    }

    public void removeClassAs( final com.apiomat.nativemodule.migrationmodul.ClassA refData )
    {
        removeReference( "classAs", refData );
        this.classAs.remove( refData );
    }

}
